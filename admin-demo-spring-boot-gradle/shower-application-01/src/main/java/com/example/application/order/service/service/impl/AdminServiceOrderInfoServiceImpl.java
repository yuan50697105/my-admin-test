package com.example.application.order.service.service.impl;

import com.example.application.order.service.pojo.AdminServiceOrderInfoSaveRequestBody;
import com.example.application.order.service.service.AdminServiceOrderInfoService;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceInfo;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceOrderInfo;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceOrderItem;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.query.ServiceOrderInfoQuery;
import com.example.commons.db.mybatis.base.pagehelper.module.service.ServiceInfoService;
import com.example.commons.db.mybatis.base.pagehelper.module.service.ServiceOrderInfoService;
import com.example.commons.db.mybatis.base.pagehelper.module.service.ServiceOrderItemService;
import com.example.commons.db.pojo.IPageResult;
import com.example.commons.web.base.pojo.Result;
import com.example.commons.web.base.utils.ResultUtils;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-12 21:13
 */
@Service
@AllArgsConstructor
public class AdminServiceOrderInfoServiceImpl implements AdminServiceOrderInfoService {
    private final ServiceOrderInfoService serviceOrderInfoService;
    private final ServiceOrderItemService serviceOrderItemService;
    private final ServiceInfoService serviceInfoService;


    @Override
    public Result data(ServiceOrderInfoQuery query) {
        IPageResult<ServiceOrderInfo> pageResult = serviceOrderInfoService.selectPageByQuery(query);
        return ResultUtils.data(pageResult);
    }

    @Override
    public Result list(ServiceOrderInfoQuery query) {
        List<ServiceOrderInfo> orderInfos = serviceOrderInfoService.selectByQuery(query);
        return ResultUtils.data(orderInfos);
    }

    @Override
    public Result get(Long id) {
        ServiceOrderInfo orderInfo = serviceOrderInfoService.selectByPrimaryKey(id);
        return ResultUtils.data("orderInfo", orderInfo);
    }

    @Override
    public Result get(List<Long> ids) {
        List<ServiceOrderInfo> orderInfos = serviceOrderInfoService.selectByPrimaryKeys(ids);
        return ResultUtils.data("orderInfos", orderInfos);
    }

    @SneakyThrows
    @Override
    public Result save(AdminServiceOrderInfoSaveRequestBody requestBody) {
        // TODO: 2020/4/12 添加订单
        ServiceOrderInfo serviceOrderInfo = new ServiceOrderInfo();
        serviceOrderInfo.copyFrom(requestBody);
        serviceOrderInfoService.insert(serviceOrderInfo);
        ArrayList<ServiceOrderItem> serviceOrderItems = new ArrayList<>(requestBody.getItems().size());
        for (AdminServiceOrderInfoSaveRequestBody.AdminServiceOrderItem item : requestBody.getItems()) {
            Future<ServiceInfo> future = getServiceInfoById(item.getServiceId());
            ServiceInfo serviceInfo = future.get();
            ServiceOrderItem serviceOrderItem = new ServiceOrderItem();
            serviceOrderItem.setOrderId(serviceOrderInfo.getId());
            serviceOrderItem.setOrderNo(serviceOrderInfo.getOrderNo());
            serviceOrderItem.setServiceId(serviceInfo.getId());
            serviceOrderItem.setServiceCode(serviceInfo.getCode());
            serviceOrderItem.setServiceName(serviceInfo.getName());
            serviceOrderItem.setNum(item.getServiceNum());
            serviceOrderItem.setPrice(serviceInfo.getPrice());
            serviceOrderItems.add(serviceOrderItem);
        }
        serviceOrderItemService.batchInsert(serviceOrderItems);
        return ResultUtils.saveOk();
//        throw new ResultRuntimeException(ResultUtils.notImplemntError());
    }

    @Async
    public Future<ServiceInfo> getServiceInfoById(Long goodsId) {
        ServiceInfo serviceInfo = serviceInfoService.selectByPrimaryKey(goodsId);
        return new AsyncResult<>(serviceInfo);
    }
}