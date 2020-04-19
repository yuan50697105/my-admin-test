package com.example.commons.db.mybatis.base.sqlhelper.module.pojo.query;

import com.example.commons.db.mybatis.base.sqlhelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.ServiceOrderItemExample;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-12 20:57
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ServiceOrderItemQuery extends CommonsQuery implements MybatisExample<ServiceOrderItemExample> {
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
    private Long serviceId;

    /**
     * 商品编号
     */
    @AndLike
    private String serviceCode;

    /**
     * 商品名称
     */
    @AndLike
    private String serviceName;
}