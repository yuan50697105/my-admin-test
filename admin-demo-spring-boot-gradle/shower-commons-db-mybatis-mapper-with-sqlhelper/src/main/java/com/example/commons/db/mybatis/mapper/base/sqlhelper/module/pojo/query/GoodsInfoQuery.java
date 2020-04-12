package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.query;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.GoodsInfo;
import com.gitee.denger.mybatis.example.ext.MybatisExampleForTk;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.entity.Example;

import java.math.BigDecimal;

/**
 * goods_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GoodsInfoQuery extends CommonsQuery implements MybatisExampleForTk<GoodsInfo, Example> {
    private static final long serialVersionUID = 1L;
    /**
     * 商品编号
     */
    @AndLike
    private String code;
    /**
     * 商品名称
     */
    @AndLike
    private String name;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 库存
     */
    private Integer num;
}