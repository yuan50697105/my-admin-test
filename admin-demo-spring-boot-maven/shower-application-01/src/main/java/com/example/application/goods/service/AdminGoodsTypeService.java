package com.example.application.goods.service;

import com.example.application.goods.pojo.type.GoodsTypeSaveRequestBody;
import com.example.application.goods.pojo.type.GoodsTypeUpdateRequestBody;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.query.GoodsTypeQuery;
import com.example.commons.web.base.pojo.Result;

import java.util.List;

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

    Result get(Long id);

    Result save(GoodsTypeSaveRequestBody requestBody);

    Result update(GoodsTypeUpdateRequestBody requestBody);

    Result delete(Long id);

    Result delete(List<Long> ids);
}
