package com.example.commons.db.mybatis.base.sqlhelper.test.pojo.query;

import com.example.commons.db.mybatis.base.sqlhelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.base.sqlhelper.test.pojo.CustomerTypeExample;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 22:15
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerTypeQuery extends CommonsQuery implements MybatisExample<CustomerTypeExample> {
    /**
     * 编号
     */
    @AndLike
    private String code;

    /**
     * 名称
     */
    @AndLike
    private String name;
}