package com.example.commons.db.mybatis.jpa.base.sqlhelper.module.pojo;

import com.example.commons.db.mybatis.jpa.base.sqlhelper.commons.pojo.CommonsEntity;
import lombok.*;

import javax.persistence.Entity;
import java.io.Serializable;

/**
    * customer_type
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CustomerType extends CommonsEntity implements Serializable {
    /**
    * 编号
    */
    private String code;

    /**
    * 名称
    */
    private String name;

    private static final long serialVersionUID = 1L;
}