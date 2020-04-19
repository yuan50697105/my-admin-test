package org.yuan.admin.db.commons.entity;

import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;
import org.yuan.admin.commons.entity.ICommonsQuery;

import java.util.Date;

/**
 * @program: my-admin-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-19 18:54
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CommonsQuery extends ICommonsQuery {
    @AndEqualTo
    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @AndGreaterThanOrEqualTo(property = "createTime")
    private Date createDateStart;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @AndLessThanOrEqualTo(property = "createTime")
    private Date createDateEnd;
}