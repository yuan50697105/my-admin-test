package com.example.commons.db.mybatis.base.pagehelper.test.pojo.query;

import com.example.commons.db.mybatis.base.pagehelper.commons.pojo.query.CommonsQuery;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
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
public class SysUserQuery extends CommonsQuery {
    @AndLike
    private String username;
    @AndLike
    private String name;
    @AndEqualTo
    private String enabled;
}