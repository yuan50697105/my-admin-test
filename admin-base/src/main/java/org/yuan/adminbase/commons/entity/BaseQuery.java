package org.yuan.adminbase.commons.entity;

import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndGreaterThanOrEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLessThanOrEqualTo;
import lombok.Data;

import java.util.Date;

/**
 * @program: admin-base
 * @description:
 * @author: yuane
 * @create: 2020-04-25 12:50
 */
@Data
public class BaseQuery {
    private int page = 1;
    private int size = 20;
    @AndEqualTo
    private Long id;
    @AndEqualTo
    private String createUser;
    @AndEqualTo
    private String updateUser;
    @AndGreaterThanOrEqualTo(property = "createTime")
    private Date createDateStart;
    @AndLessThanOrEqualTo(property = "createTime")
    private Date updateDateEnd;
    @AndEqualTo
    private String deleted;
}