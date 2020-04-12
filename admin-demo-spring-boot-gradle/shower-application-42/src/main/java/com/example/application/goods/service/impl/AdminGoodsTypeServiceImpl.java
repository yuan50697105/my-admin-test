package com.example.application.goods.service.impl;

import com.example.application.goods.pojo.type.GoodsTypeSaveRequestBody;
import com.example.application.goods.pojo.type.GoodsTypeUpdateRequestBody;
import com.example.application.goods.service.AdminGoodsTypeService;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.pojo.GoodsType;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.pojo.query.GoodsTypeQuery;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.service.GoodsTypeService;
import com.example.commons.web.pojo.Result;
import com.example.commons.web.utils.ResultUtils;
import com.example.db.pojo.IPageResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    public Result get(Long id) {
        GoodsType goodsType = goodsTypeService.selectByPrimaryKey(id);
        return ResultUtils.data("goodsType",goodsType);
    }

    @Override
    @Transactional
    public Result save(GoodsTypeSaveRequestBody requestBody) {
        GoodsType goodsType = new GoodsType();
        goodsType.copyFrom(requestBody);
        goodsTypeService.insert(goodsType);
        return ResultUtils.saveOk();
    }

    @Override
    @Transactional
    public Result update(GoodsTypeUpdateRequestBody requestBody) {
        GoodsType goodsType = goodsTypeService.selectByPrimaryKey(requestBody.getId());
        goodsType.copyFrom(requestBody);
        goodsTypeService.updateByPrimaryKeySelective(goodsType);
        return ResultUtils.updateOk();
    }

    @Override
    @Transactional
    public Result delete(Long id) {
        goodsTypeService.deleteByPrimaryKey(id);
        return ResultUtils.deleteOk();
    }

    @Override
    @Transactional
    public Result delete(List<Long> ids) {
        goodsTypeService.deleteByPrimaryKeys(ids);
        return ResultUtils.deleteOk();
    }
}