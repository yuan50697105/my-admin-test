package com.example.commons.db.mybatis.base.pagehelper.module.pojo.query;

import com.example.commons.db.mybatis.base.pagehelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceInfoExample;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * service_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ServiceInfoQuery extends CommonsQuery implements MybatisExample<ServiceInfoExample> {
    private static final long serialVersionUID = 1L;
    /**
     * 类型ID
     */
    @AndEqualTo
    private Long typeId;
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