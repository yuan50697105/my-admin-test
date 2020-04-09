package com.example.commons.db.mybatis.ext.pagehelper.commons.pojo.query;

import com.example.commons.db.pojo.BaseDbQuery;
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
    @AndEqualTo(property = "id")
    private Long id;
    @AndGreaterThanOrEqualTo(property = "createTime")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDateStart;
    @AndLessThanOrEqualTo(property = "createTime")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDateEnd;
}