package com.example.commons.db.mybatis.base.pagehelper.test.pojo.query;

import com.example.commons.db.mybatis.base.pagehelper.commons.pojo.query.CommonsQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 13:34
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GoodsTypeQuery extends CommonsQuery {
    private String code;
    private String name;
}