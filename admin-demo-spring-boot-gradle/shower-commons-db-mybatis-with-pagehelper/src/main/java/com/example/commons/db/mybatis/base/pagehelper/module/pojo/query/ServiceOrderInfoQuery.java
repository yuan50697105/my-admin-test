package com.example.commons.db.mybatis.base.pagehelper.module.pojo.query;

import com.example.commons.db.mybatis.base.pagehelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceOrderInfoExample;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * service_order_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ServiceOrderInfoQuery extends CommonsQuery implements MybatisExample<ServiceOrderInfoExample> {
    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 客户ID
     */
    private Long customerId;

    /**
     * 客户姓名
     */
    private String customerName;

    /**
     * 总价
     */
    private BigDecimal totalPrice;

    private static final long serialVersionUID = 1L;
}