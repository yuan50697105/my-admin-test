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
 * @create: 2020-04-06 13:34
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysUserLogQuery extends CommonsQuery {
    @AndEqualTo
    private String userId;
    @AndLike
    private String username;
    @AndLike
    private String name;
}