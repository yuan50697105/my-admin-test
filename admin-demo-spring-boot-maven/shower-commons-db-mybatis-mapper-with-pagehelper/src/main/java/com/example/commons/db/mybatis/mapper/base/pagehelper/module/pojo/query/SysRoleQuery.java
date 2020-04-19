package com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.query;

import com.example.commons.db.mybatis.mapper.base.pagehelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.SysRole;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.entity.Example;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 14:49
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysRoleQuery extends CommonsQuery implements MybatisExampleForTk<SysRole, Example> {
    @AndLike
    private String name;
    @AndLike
    private String code;
}