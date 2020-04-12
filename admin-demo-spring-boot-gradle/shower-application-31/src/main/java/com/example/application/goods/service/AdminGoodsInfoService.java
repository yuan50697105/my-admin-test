package com.example.application.goods.service;

import com.example.application.goods.pojo.info.GoodsInfoSaveRequestBody;
import com.example.application.goods.pojo.info.GoodsInfoUpdateRequestBody;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.query.GoodsInfoQuery;
import com.example.commons.web.pojo.Result;

import java.util.List;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 12:54
 */
public interface AdminGoodsInfoService {
    Result data(GoodsInfoQuery query);

    Result list(GoodsInfoQuery query);

    Result get(Long id);

    Result save(GoodsInfoSaveRequestBody requestBody);

    Result update(GoodsInfoUpdateRequestBody requestBody);

    Result delete(Long id);

    Result delete(List<Long> ids);
}
