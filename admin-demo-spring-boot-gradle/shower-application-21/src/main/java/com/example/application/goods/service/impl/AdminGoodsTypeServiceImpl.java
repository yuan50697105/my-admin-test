package com.example.application.goods.service.impl;

import com.example.application.goods.pojo.type.GoodsTypeSaveRequestBody;
import com.example.application.goods.pojo.type.GoodsTypeUpdateRequestBody;
import com.example.application.goods.service.AdminGoodsTypeService;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.GoodsType;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.query.GoodsTypeQuery;
import com.example.commons.db.mybatis.plus.pagehelper.module.service.GoodsTypeService;
import com.example.commons.web.base.pojo.Result;
import com.example.commons.web.base.utils.ResultUtils;
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
    private final GoodsTypeService goodsTypeService;

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
        GoodsType goodsType = goodsTypeService.getById(id);
        return ResultUtils.data("goodsType",goodsType);
    }

    @Override
    @Transactional
    public Result save(GoodsTypeSaveRequestBody requestBody) {
        GoodsType goodsType = new GoodsType();
        goodsType.copyFrom(requestBody);
        goodsTypeService.save(goodsType);
        return ResultUtils.saveOk();
    }

    @Override
    @Transactional
    public Result update(GoodsTypeUpdateRequestBody requestBody) {
        GoodsType goodsType = goodsTypeService.getById(requestBody.getId());
        goodsType.copyFrom(requestBody);
        goodsTypeService.updateById(goodsType);
        return ResultUtils.updateOk();
    }

    @Override
    @Transactional
    public Result delete(Long id) {
        goodsTypeService.removeById(id);
        return ResultUtils.deleteOk();
    }

    @Override
    @Transactional
    public Result delete(List<Long> ids) {
        goodsTypeService.removeByIds(ids);
        return ResultUtils.deleteOk();
    }
}