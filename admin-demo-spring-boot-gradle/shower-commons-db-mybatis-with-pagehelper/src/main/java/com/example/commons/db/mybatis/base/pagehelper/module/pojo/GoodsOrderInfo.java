package com.example.commons.db.mybatis.base.pagehelper.module.pojo;

import com.example.commons.db.mybatis.base.pagehelper.commons.pojo.CommonsEntity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * goods_order_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GoodsOrderInfo extends CommonsEntity implements Serializable {
    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 客户ID
     */
    private String customerId;

    /**
     * 客户姓名
     */
    private String customerName;

    /**
     * 总价
     */
    private BigDecimal totalPrice;

    private static final long serialVersionUID = 1L;

    public static GoodsOrderInfoBuilder builder() {
        return new GoodsOrderInfoBuilder();
    }
}