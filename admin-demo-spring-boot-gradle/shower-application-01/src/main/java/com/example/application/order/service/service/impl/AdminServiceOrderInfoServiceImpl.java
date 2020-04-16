package com.example.application.order.service.service.impl;

import com.example.application.order.service.pojo.AdminServiceOrderInfoSaveRequestBody;
import com.example.application.order.service.service.AdminServiceOrderInfoService;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceOrderInfo;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.query.ServiceOrderInfoQuery;
import com.example.commons.db.mybatis.base.pagehelper.module.service.impl.ServiceOrderInfoService;
import com.example.commons.web.base.exception.ResultRuntimeException;
import com.example.commons.web.base.pojo.Result;
import com.example.commons.web.base.utils.ResultUtils;
import com.example.db.pojo.IPageResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public Result save(AdminServiceOrderInfoSaveRequestBody requestBody) {
        // TODO: 2020/4/12 添加订单
        throw new ResultRuntimeException(ResultUtils.notImplemntError());
    }
}