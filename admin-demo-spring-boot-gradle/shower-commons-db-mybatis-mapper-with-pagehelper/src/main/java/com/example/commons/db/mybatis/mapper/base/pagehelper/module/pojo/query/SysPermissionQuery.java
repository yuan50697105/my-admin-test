package com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.query;

import com.example.commons.db.mybatis.mapper.base.pagehelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.SysPermission;
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
 * @create: 2020-04-09 20:23
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysPermissionQuery extends CommonsQuery implements MybatisExampleForTk<SysPermission, Example> {
    @AndLike
    private String name;
    @AndLike
    private String code;
    @AndEqualTo
    private String type;
}