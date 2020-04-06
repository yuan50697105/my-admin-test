package com.example.commons.db.mybatis.ext.sqlhelper.test.pojo.query;

import com.example.commons.db.mybatis.ext.sqlhelper.test.pojo.SysUserExample;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 13:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysUserQuery extends CommonsQuery implements MybatisExample<SysUserExample> {
    @AndLike(property = "username")
    private String username;
    @AndLike(property = "name")
    private String name;
    private String enabled;
}