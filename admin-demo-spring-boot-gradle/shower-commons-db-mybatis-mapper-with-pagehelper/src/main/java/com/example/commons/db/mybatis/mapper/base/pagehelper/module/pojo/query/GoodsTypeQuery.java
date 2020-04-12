package com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.query;

import com.example.commons.db.mybatis.mapper.base.pagehelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.GoodsType;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;

/**
 * goods_type
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GoodsTypeQuery extends CommonsQuery implements Serializable, MybatisExampleForTk<GoodsType, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * 编号
     */
    private String code;
    /**
     * 名称
     */
    private String name;
}