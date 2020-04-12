package com.example.application.goods.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.example.application.goods.pojo.info.GoodsInfoSaveRequestBody;
import com.example.application.goods.pojo.info.GoodsInfoUpdateRequestBody;
import com.example.application.goods.service.AdminGoodsInfoService;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.pojo.GoodsInfo;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.pojo.query.GoodsInfoQuery;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.service.GoodsInfoService;
import com.example.commons.web.base.exception.ResultRuntimeException;
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
 * @create: 2020-04-11 12:54
 */
@Service
@AllArgsConstructor
public class AdminGoodsInfoServiceImpl implements AdminGoodsInfoService {
    private GoodsInfoService goodsInfoService;

    @Override
    public Result data(GoodsInfoQuery query) {
        IPageResult<GoodsInfo> goodsInfos = goodsInfoService.selectPageByQuery(query);
        return ResultUtils.data(goodsInfos);
    }

    @Override
    public Result list(GoodsInfoQuery query) {
        List<GoodsInfo> list = goodsInfoService.selectByQuery(query);
        return ResultUtils.data("list", list);
    }

    @Override
    public Result get(Long id) {
        GoodsInfo goodsInfo = goodsInfoService.selectByPrimaryKey(id);
        return ResultUtils.data("goodsInfo", goodsInfo);
    }

    @Override
    @Transactional
    public Result save(GoodsInfoSaveRequestBody requestBody) {
        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.copyFrom(requestBody);
        goodsInfoService.insert(goodsInfo);
        return ResultUtils.saveOk();
    }

    @Override
    @Transactional
    public Result update(GoodsInfoUpdateRequestBody requestBody) {
        GoodsInfo goodsInfo = goodsInfoService.selectByPrimaryKey(requestBody.getId());
        if (ObjectUtil.isEmpty(goodsInfo)) {
            throw new ResultRuntimeException(ResultUtils.infoNotExistError());
        }
        goodsInfo.copyFrom(requestBody);
        goodsInfoService.updateByPrimaryKeySelective(goodsInfo);
        return ResultUtils.updateOk();
    }

    @Override
    @Transactional
    public Result delete(Long id) {
        goodsInfoService.deleteByPrimaryKey(id);
        return ResultUtils.deleteOk();
    }

    @Override
    @Transactional
    public Result delete(List<Long> ids) {
        goodsInfoService.deleteByPrimaryKeys(ids);
        return ResultUtils.deleteOk();
    }

}