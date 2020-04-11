package com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.query;

import com.example.commons.db.mybatis.plus.sqlhelper.commons.pojo.query.CommonsQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 14:49
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysRoleQuery extends CommonsQuery {
    private String name;
    private String code;
}