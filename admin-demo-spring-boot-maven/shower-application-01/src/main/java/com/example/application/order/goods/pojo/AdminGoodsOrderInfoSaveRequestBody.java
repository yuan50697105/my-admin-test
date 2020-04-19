package com.example.application.order.goods.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-12 20:23
 */
@Data
public class AdminGoodsOrderInfoSaveRequestBody {
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
    private List<AdminGoodsOrderItem> items;

    @Data
    public static class AdminGoodsOrderItem {
        private Long goodsId;
        private Integer goodsNum;
    }

}