package com.example.commons.db.mybatis.ext.sqlhelper.test.pojo.query;

import com.example.commons.db.mybatis.ext.sqlhelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.ext.sqlhelper.test.pojo.SysPermissionExample;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-09 20:23
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysPermissionQuery extends CommonsQuery implements MybatisExample<SysPermissionExample> {
    @AndLike
    private String name;
    @AndLike
    private String code;
    @AndEqualTo
    private String type;
}