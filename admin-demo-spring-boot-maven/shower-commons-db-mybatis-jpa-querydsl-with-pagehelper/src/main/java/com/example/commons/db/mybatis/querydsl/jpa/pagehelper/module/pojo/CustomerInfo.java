package com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.pojo;

import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.commons.pojo.CommonsEntity;
import lombok.*;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * customer_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CustomerInfo extends CommonsEntity implements Serializable {
    /**
     * 编号
     */
    private String code;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 电话
     */
    private String phone;

    private static final long serialVersionUID = 1L;

    public static CustomerInfoBuilder builder() {
        return new CustomerInfoBuilder();
    }
}