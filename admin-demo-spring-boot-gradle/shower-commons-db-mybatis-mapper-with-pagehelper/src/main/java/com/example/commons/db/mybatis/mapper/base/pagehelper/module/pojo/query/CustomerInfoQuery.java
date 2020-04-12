package com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.query;

import com.example.commons.db.mybatis.mapper.base.pagehelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.CustomerInfo;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.entity.Example;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-12 10:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerInfoQuery extends CommonsQuery implements MybatisExampleForTk<CustomerInfo, Example> {
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
    @AndEqualTo
    private Integer age;
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