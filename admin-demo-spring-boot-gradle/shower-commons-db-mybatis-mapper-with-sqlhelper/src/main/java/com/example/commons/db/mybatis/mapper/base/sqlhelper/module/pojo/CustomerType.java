package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.commons.pojo.CommonsEntity;
import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
    * customer_type
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer_type")
public class CustomerType extends CommonsEntity implements Serializable {
    /**
     * 编号
     */
    @Column(name = "code")
    private String code;

    /**
     * 名称
     */
    @Column(name = "`name`")
    private String name;

    private static final long serialVersionUID = 1L;
}