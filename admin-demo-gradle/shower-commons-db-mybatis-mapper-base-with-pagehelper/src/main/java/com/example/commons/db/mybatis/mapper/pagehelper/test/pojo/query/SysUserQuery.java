package com.example.commons.db.mybatis.mapper.pagehelper.test.pojo.query;

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
    private String username;
    private String name;
    private String enabled;
}