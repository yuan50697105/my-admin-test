package com.example.application.service.pojo.info;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-12 21:09
 */
@Data
public class AdminServiceInfoUpdateRequestBody {
    /**
     * 主键
     */
    private Long id;
    /**
     * 类型ID
     */
    private Long typeId;
    /**
     * 编号
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 价格
     */
    private BigDecimal price;

}