package com.example.commons.db.mybatis.base.pagehelper.module.pojo.query;

import com.example.commons.db.mybatis.base.pagehelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceTypeExample;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * service_type
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ServiceTypeQuery extends CommonsQuery implements MybatisExample<ServiceTypeExample> {
    private static final long serialVersionUID = 1L;
    /**
     * 编号
     */
    @AndLike
    private String code;
    /**
     * 名称
     */
    @AndLike
    private String name;
}