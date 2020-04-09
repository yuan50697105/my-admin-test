package com.example.commons.db.mybatis.mapper.ext.pagehelper.test.pojo.query;

import com.example.commons.db.mybatis.mapper.ext.pagehelper.commons.pojo.query.CommonsQuery;
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
    private String userId;
    private String username;
    private String name;
}