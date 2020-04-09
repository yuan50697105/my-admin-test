package com.example.commons.db.mybatis.sqlhelper.commons.pojo.query;

import com.example.commons.db.pojo.BaseDbQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
    private Date createDateStart;
    private Date createDateEnd;
}