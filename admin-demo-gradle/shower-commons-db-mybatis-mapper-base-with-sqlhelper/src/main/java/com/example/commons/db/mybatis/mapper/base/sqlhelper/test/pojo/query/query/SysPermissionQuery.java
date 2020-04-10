package com.example.commons.db.mybatis.mapper.base.sqlhelper.test.pojo.query.query;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.commons.pojo.query.CommonsQuery;
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
public class SysPermissionQuery extends CommonsQuery {
    private String name;
    private String code;
    private String type;
}