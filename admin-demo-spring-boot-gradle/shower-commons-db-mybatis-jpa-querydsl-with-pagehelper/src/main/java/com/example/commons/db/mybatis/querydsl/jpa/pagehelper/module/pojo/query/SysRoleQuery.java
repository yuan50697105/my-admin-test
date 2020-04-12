package com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.pojo.query;

import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.pojo.SysRoleExample;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 14:49
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysRoleQuery extends CommonsQuery implements MybatisExample<SysRoleExample> {
    @AndLike
    private String name;
    @AndLike
    private String code;
}