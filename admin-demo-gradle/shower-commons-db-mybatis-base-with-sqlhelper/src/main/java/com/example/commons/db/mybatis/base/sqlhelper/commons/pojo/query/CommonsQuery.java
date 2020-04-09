package com.example.commons.db.mybatis.base.sqlhelper.commons.pojo.query;

import com.example.commons.db.pojo.BaseDbQuery;
import com.fasterxml.jackson.annotation.JsonFormat;
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
    private Long id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDateStart;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDateEnd;
}