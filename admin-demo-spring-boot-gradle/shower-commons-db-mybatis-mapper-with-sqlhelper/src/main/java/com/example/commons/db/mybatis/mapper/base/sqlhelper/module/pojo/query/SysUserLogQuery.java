package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.query;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.SysUserLog;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.entity.Example;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 13:34
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysUserLogQuery extends CommonsQuery implements MybatisExampleForTk<SysUserLog, Example> {
    @AndEqualTo
    private String userId;
    @AndLike
    private String username;
    @AndLike
    private String name;
}