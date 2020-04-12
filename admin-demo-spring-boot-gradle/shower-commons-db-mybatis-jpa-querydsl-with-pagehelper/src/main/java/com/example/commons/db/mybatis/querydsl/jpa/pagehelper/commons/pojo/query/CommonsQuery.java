package com.example.commons.db.mybatis.querydsl.jpa.pagehelper.commons.pojo.query;

import com.example.db.pojo.BaseDbQuery;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 13:29
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CommonsQuery extends BaseDbQuery {
    @AndEqualTo
    private Long id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @AndGreaterThanOrEqualTo(property = "createTime")
    private Date createDateStart;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @AndLessThanOrEqualTo(property = "createTime")
    private Date createDateEnd;
}