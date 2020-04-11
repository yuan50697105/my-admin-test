package com.example.application.service.goods.impl;

import com.example.application.service.goods.AdminGoodsTypeService;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.GoodsType;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.query.GoodsTypeQuery;
import com.example.commons.db.mybatis.base.pagehelper.test.service.GoodsTypeService;
import com.example.commons.db.pojo.IPageResult;
import com.example.commons.web.pojo.Result;
import com.example.commons.web.utils.ResultUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 13:36
 */
@Service
@AllArgsConstructor
public class AdminGoodsTypeServiceImpl implements AdminGoodsTypeService {
    private GoodsTypeService goodsTypeService;

    @Override
    public Result data(GoodsTypeQuery query) {
        IPageResult<GoodsType> goodsTypes = goodsTypeService.selectPageByQuery(query);
        return ResultUtils.data(goodsTypes);
    }

    @Override
    public Result list(GoodsTypeQuery query) {
        List<GoodsType> goodsTypes = goodsTypeService.selectByQuery(query);
        return ResultUtils.data(goodsTypes);
    }
}