package com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.pojo.query;

import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.pojo.SysUserLogExample;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 13:34
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysUserLogQuery extends CommonsQuery implements MybatisExample<SysUserLogExample> {
    @AndEqualTo
    private String userId;
    @AndLike
    private String username;
    @AndLike
    private String name;
}