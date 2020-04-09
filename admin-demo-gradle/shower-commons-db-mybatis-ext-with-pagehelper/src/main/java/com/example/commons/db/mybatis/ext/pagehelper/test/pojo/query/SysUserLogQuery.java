package com.example.commons.db.mybatis.ext.pagehelper.test.pojo.query;

import com.example.commons.db.mybatis.ext.pagehelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.ext.pagehelper.test.pojo.SysUserLogExample;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
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
    @AndEqualTo(property = "userId")
    private String userId;
    @AndEqualTo(property = "username")
    private String username;
    @AndEqualTo(property = "name")
    private String name;
}