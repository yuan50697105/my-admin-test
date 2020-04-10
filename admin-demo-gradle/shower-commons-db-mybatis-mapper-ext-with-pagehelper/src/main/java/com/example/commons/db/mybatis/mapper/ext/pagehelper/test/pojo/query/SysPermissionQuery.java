package com.example.commons.db.mybatis.mapper.ext.pagehelper.test.pojo.query;

import com.example.commons.db.mybatis.mapper.ext.pagehelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.mapper.ext.pagehelper.test.pojo.SysPermission;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
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
public class SysPermissionQuery extends CommonsQuery implements MybatisExampleForTk<Example, SysPermission> {
    private String name;
    private String code;
    private String type;
}