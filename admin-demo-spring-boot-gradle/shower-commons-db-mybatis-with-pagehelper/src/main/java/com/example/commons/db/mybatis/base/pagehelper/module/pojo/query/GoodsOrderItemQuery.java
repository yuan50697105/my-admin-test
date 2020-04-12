package com.example.commons.db.mybatis.base.pagehelper.module.pojo.query;

import com.example.commons.db.mybatis.base.pagehelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.GoodsOrderItemExample;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-12 20:20
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GoodsOrderItemQuery extends CommonsQuery implements MybatisExample<GoodsOrderItemExample> {
    /**
     * 订单ID
     */
    @AndEqualTo
    private Long orderId;

    /**
     * 订单号
     */
    @AndLike
    private String orderNo;

    /**
     * 商品ID
     */
    @AndEqualTo
    private Long goodsId;

    /**
     * 商品编号
     */
    @AndLike
    private String goodsCode;

    /**
     * 商品名称
     */
    @AndLike
    private String goodsName;
}