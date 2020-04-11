package com.example.commons.db.mybatis.base.pagehelper.test.pojo.query;

import com.example.commons.db.mybatis.base.pagehelper.commons.pojo.query.CommonsQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 12:47
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GoodsInfoQuery extends CommonsQuery {
    private String code;
    private String name;
}