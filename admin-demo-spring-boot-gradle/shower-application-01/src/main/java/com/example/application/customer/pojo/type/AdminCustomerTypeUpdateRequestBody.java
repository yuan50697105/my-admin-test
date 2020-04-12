package com.example.application.customer.pojo.type;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * customer_type
 */
@Data
public class AdminCustomerTypeUpdateRequestBody {
    @NotNull
    private Long id;
    /**
     * 名称
     */
    @NotBlank
    private String name;
}