package org.yuan.adminbase.commons.entity;

import lombok.Data;

import java.util.Date;

/**
 * @program: admin-base
 * @description: 基础实体
 * @author: yuane
 * @create: 2020-04-24 21:45
 */
@Data
public class BaseEntity {
    private Long id;
    private String createUser;
    private String updateUser;
    private Date createTime;
    private Date updateTime;
    private String deleted;
}