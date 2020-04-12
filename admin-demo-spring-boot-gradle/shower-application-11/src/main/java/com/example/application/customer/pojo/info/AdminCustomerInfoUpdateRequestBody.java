package com.example.application.customer.pojo.info;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * customer_info
 */
@Data
public class AdminCustomerInfoUpdateRequestBody {
    /**
     * 编号
     */
    @NotNull
    private Long id;
    /**
     * 姓名
     */
    @NotBlank
    private String name;
    /**
     * 性别
     */
    @NotBlank
    private String gender;
    /**
     * 年龄
     */
    @NotNull
    private Integer age;
    /**
     * 电话
     */
    @NotBlank
    private String phone;
}