package com.example.commons.db.mybatis.base.sqlhelper.module.pojo.query;

import com.example.commons.db.mybatis.base.sqlhelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.GoodsOrderInfoExample;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-12 20:19
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GoodsOrderInfoQuery extends CommonsQuery implements MybatisExample<GoodsOrderInfoExample> {
    /**
     * 订单号
     */
    @AndLike
    private String orderNo;

    /**
     * 客户ID
     */
    @AndEqualTo
    private String customerId;

    /**
     * 客户姓名
     */
    @AndLike
    private String customerName;
}