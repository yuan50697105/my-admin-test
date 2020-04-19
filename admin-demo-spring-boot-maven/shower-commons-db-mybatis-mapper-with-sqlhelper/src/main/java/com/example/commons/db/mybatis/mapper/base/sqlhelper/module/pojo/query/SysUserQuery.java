package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.query;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.SysUser;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.entity.Example;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 13:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysUserQuery extends CommonsQuery implements MybatisExampleForTk<SysUser, Example> {
    @AndLike
    private String username;
    @AndLike
    private String name;
    private String enabled;
}