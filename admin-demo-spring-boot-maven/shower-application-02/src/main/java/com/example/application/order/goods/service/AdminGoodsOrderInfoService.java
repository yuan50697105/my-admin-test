package com.example.application.order.goods.service;

import com.example.application.order.goods.pojo.AdminGoodsOrderInfoSaveRequestBody;
import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.query.GoodsOrderInfoQuery;
import com.example.commons.web.base.pojo.Result;

import java.util.List;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-12 20:25
 */
public interface AdminGoodsOrderInfoService {
    Result data(GoodsOrderInfoQuery query);

    Result list(GoodsOrderInfoQuery query);

    Result get(Long id);

    Result get(List<Long> ids);

    Result save(AdminGoodsOrderInfoSaveRequestBody requestBody);
}
