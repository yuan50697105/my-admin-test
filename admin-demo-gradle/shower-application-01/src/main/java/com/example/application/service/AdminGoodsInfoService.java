package com.example.application.service;

import com.example.commons.db.mybatis.base.pagehelper.test.pojo.query.GoodsInfoQuery;
import com.example.commons.web.pojo.Result;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 12:54
 */
public interface AdminGoodsInfoService {
    Result data(GoodsInfoQuery query);

}
