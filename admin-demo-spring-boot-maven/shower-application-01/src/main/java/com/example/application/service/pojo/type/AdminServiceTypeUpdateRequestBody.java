package com.example.application.service.pojo.type;

import lombok.Data;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-12 21:12
 */
@Data
public class AdminServiceTypeUpdateRequestBody {
    /**
     * 主键
     */
    private Long id;
    /**
     * 编号
     */
    private String code;

    /**
     * 名称
     */
    private String name;

}