package com.example.application.order.goods.service.impl;

import com.example.application.order.goods.pojo.AdminGoodsOrderInfoSaveRequestBody;
import com.example.application.order.goods.service.AdminGoodsOrderInfoService;
import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.GoodsOrderInfo;
import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.query.GoodsOrderInfoQuery;
import com.example.commons.db.mybatis.base.sqlhelper.module.service.GoodsOrderInfoService;
import com.example.commons.web.base.exception.ResultRuntimeException;
import com.example.commons.web.base.pojo.Result;
import com.example.commons.web.base.utils.ResultUtils;
import com.example.commons.db.pojo.IPageResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public Result save(AdminGoodsOrderInfoSaveRequestBody requestBody) {
        // TODO: 2020/4/12 订单添加
        throw new ResultRuntimeException(ResultUtils.notImplemntError());
    }
}