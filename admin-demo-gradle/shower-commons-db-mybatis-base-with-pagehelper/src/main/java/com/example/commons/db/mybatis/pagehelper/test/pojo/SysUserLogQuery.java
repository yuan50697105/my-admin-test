package com.example.commons.db.mybatis.pagehelper.test.pojo;

import com.example.commons.db.mybatis.pagehelper.pojo.BaseDbQuery;
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
public class SysUserLogQuery extends BaseDbQuery {
    private String userId;
    private String username;
    private String name;
}