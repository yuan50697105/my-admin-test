package com.example.application.order.goods.service.impl;

import com.example.application.order.goods.pojo.AdminGoodsOrderInfoSaveRequestBody;
import com.example.application.order.goods.service.AdminGoodsOrderInfoService;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.GoodsInfo;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.GoodsOrderInfo;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.GoodsOrderItem;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.query.GoodsOrderInfoQuery;
import com.example.commons.db.mybatis.base.pagehelper.module.service.GoodsInfoService;
import com.example.commons.db.mybatis.base.pagehelper.module.service.GoodsOrderInfoService;
import com.example.commons.db.mybatis.base.pagehelper.module.service.GoodsOrderItemService;
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
 * @create: 2020-04-12 20:25
 */
@Service
@AllArgsConstructor
public class AdminGoodsOrderInfoServiceImpl implements AdminGoodsOrderInfoService {
    private final GoodsOrderInfoService goodsOrderInfoService;
    private final GoodsInfoService goodsInfoService;
    private final GoodsOrderItemService goodsOrderItemService;

    @Override
    public Result data(GoodsOrderInfoQuery query) {
        IPageResult<GoodsOrderInfo> pageResult = goodsOrderInfoService.selectPageByQuery(query);
        return ResultUtils.data(pageResult);
    }

    @Override
    public Result list(GoodsOrderInfoQuery query) {
        List<GoodsOrderInfo> list = goodsOrderInfoService.selectByQuery(query);
        return ResultUtils.data(list);
    }

    @Override
    public Result get(Long id) {
        GoodsOrderInfo orderInfo = goodsOrderInfoService.selectByPrimaryKey(id);
        return ResultUtils.data("orderInfo", orderInfo);
    }

    @Override
    public Result get(List<Long> ids) {
        List<GoodsOrderInfo> orderInfos = goodsOrderInfoService.selectByPrimaryKeys(ids);
        return ResultUtils.data("orderInfos", orderInfos);
    }

    @SneakyThrows
    @Override
    public Result save(AdminGoodsOrderInfoSaveRequestBody requestBody) {
        // TODO: 2020/4/12 订单添加
        GoodsOrderInfo goodsOrderInfo = new GoodsOrderInfo();
        goodsOrderInfo.copyFrom(requestBody);
        goodsOrderInfoService.insert(goodsOrderInfo);
        ArrayList<GoodsOrderItem> goodsOrderItems = new ArrayList<>(requestBody.getItems().size());
        for (AdminGoodsOrderInfoSaveRequestBody.AdminGoodsOrderItem item : requestBody.getItems()) {
            Future<GoodsInfo> goods = getGoodsById(item.getGoodsId());
            GoodsInfo goodsInfo = goods.get();
            GoodsOrderItem goodsOrderItem = new GoodsOrderItem();
            goodsOrderItem.setOrderId(goodsOrderInfo.getId());
            goodsOrderItem.setOrderNo(goodsOrderInfo.getOrderNo());
            goodsOrderItem.setGoodsId(goodsInfo.getId());
            goodsOrderItem.setGoodsCode(goodsInfo.getCode());
            goodsOrderItem.setGoodsName(goodsInfo.getName());
            goodsOrderItem.setNum(item.getGoodsNum());
            goodsOrderItem.setPrice(goodsInfo.getPrice());
            goodsOrderItems.add(goodsOrderItem);
        }
        goodsOrderItemService.batchInsert(goodsOrderItems);

        return ResultUtils.saveOk();
//        throw new ResultRuntimeException(ResultUtils.notImplemntError());
    }

    @Async
    public Future<GoodsInfo> getGoodsById(Long goodsId) {
        GoodsInfo goodsInfo = goodsInfoService.selectByPrimaryKey(goodsId);
        return new AsyncResult<>(goodsInfo);
    }
}