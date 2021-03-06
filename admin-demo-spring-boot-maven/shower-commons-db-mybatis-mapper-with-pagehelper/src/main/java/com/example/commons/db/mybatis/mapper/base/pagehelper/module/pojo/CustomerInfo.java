package com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo;

import com.example.commons.db.mybatis.mapper.base.pagehelper.commons.pojo.CommonsEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
    * customer_info
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer_info")
public class CustomerInfo extends CommonsEntity implements Serializable {
    /**
     * 编号
     */
    @Column(name = "code")
    private String code;

    /**
     * 姓名
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 性别
     */
    @Column(name = "gender")
    private String gender;

    /**
     * 年龄
     */
    @Column(name = "age")
    private Integer age;

    /**
     * 电话
     */
    @Column(name = "phone")
    private String phone;

    private static final long serialVersionUID = 1L;
}