package com.example.application.customer.pojo.type;

import lombok.Data;

/**
 * customer_type
 */
@Data
public class AdminCustomerTypeSaveRequestBody {
    /**
     * 编号
     */
    private String code;
    /**
     * 名称
     */
    private String name;
}