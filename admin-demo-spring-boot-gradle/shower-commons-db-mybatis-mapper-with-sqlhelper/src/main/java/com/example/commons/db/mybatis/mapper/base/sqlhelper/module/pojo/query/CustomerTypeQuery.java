package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.query;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.CustomerType;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.entity.Example;

/**
 * customer_type
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerTypeQuery extends CommonsQuery implements MybatisExampleForTk<CustomerType, Example> {
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