package com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.query;

import com.example.commons.db.mybatis.jpa.base.pagehelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.CustomerTypeExample;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 21:28
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerTypeQuery extends CommonsQuery implements MybatisExample<CustomerTypeExample> {
    @AndLike
    private String code;
    @AndLike
    private String name;

}