package com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.query;

import com.example.commons.db.mybatis.plus.sqlhelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.CustomerInfoExample;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 21:36
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerInfoQuery extends CommonsQuery implements MybatisExample<CustomerInfoExample> {
    /**
     * 编号
     */
    @AndLike
    private String code;

    /**
     * 姓名
     */
    @AndLike
    private String name;

    /**
     * 性别
     */
    @AndEqualTo
    private String gender;

    /**
     * 年龄
     */
    @AndGreaterThanOrEqualTo(property = "age")
    private Integer ageStart;
    @AndLessThanOrEqualTo(property = "age")
    private Integer ageEnd;
    /**
     * 电话
     */
    @AndLike
    private String phone;
}