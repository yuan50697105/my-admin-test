package com.example.commons.db.mybatis.ext.pagehelper.test.pojo;

import com.example.commons.db.mybatis.ext.pagehelper.pojo.BaseDbQuery;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 03:07
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CommonsQuery extends BaseDbQuery {
    @AndEqualTo(property = "id")
    private Long id;

    @AndGreaterThanOrEqualTo(property = "create_time")
    private Date createTimeStart;

    @AndLessThanOrEqualTo(property = "create_time")
    private Date createTimeEnd;


}