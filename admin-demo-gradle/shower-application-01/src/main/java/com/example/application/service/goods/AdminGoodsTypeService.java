package com.example.application.service.goods;

import com.example.commons.db.mybatis.base.pagehelper.test.pojo.query.GoodsTypeQuery;
import com.example.commons.web.pojo.Result;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 13:36
 */
public interface AdminGoodsTypeService {
    /**
     * 分页
     * @param query 查询条件
     * @return 分页结果
     */
    Result data(GoodsTypeQuery query);

    /**
     * 列表查询
     * @param query 查询条件
     * @return 列表
     */
    Result list(GoodsTypeQuery query);
}
