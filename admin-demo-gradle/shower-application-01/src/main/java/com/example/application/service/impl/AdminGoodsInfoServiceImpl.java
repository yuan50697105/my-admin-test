package com.example.application.service.impl;

import com.example.application.service.AdminGoodsInfoService;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.GoodsInfo;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.query.GoodsInfoQuery;
import com.example.commons.db.mybatis.base.pagehelper.test.service.GoodsInfoService;
import com.example.commons.db.pojo.IPageResult;
import com.example.commons.web.pojo.Result;
import com.example.commons.web.utils.ResultUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
}