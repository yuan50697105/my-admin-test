package com.example.commons.db.mybatis.ext.pagehelper.test.pojo.query;

import com.example.commons.db.mybatis.ext.pagehelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.ext.pagehelper.test.pojo.SysRoleExample;
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
    @AndLike(property = "name")
    private String name;
    @AndLike(property = "code")
    private String code;
}