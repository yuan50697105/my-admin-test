package com.example.commons.db.mybatis.base.pagehelper.module.pojo;

import com.example.commons.db.mybatis.base.pagehelper.commons.pojo.CommonsEntity;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * service_order_item
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ServiceOrderItem extends CommonsEntity implements Serializable {
    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 商品ID
     */
    private Long serviceId;

    /**
     * 商品编号
     */
    private String serviceCode;

    /**
     * 商品名称
     */
    private String serviceName;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 价格
     */
    private BigDecimal price;

    private static final long serialVersionUID = 1L;

}