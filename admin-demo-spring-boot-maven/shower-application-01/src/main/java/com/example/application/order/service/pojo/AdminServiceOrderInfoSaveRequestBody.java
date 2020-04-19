package com.example.application.order.service.pojo;

import com.example.application.order.goods.pojo.AdminGoodsOrderInfoSaveRequestBody;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-12 21:15
 */
@Data
public class AdminServiceOrderInfoSaveRequestBody {
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
    private List<AdminGoodsOrderInfoSaveRequestBody.AdminGoodsOrderItem> items;

    @Data
    public static class AdminServiceOrderItem {
        private Long serviceId;
        private String serviceNum;
    }
}