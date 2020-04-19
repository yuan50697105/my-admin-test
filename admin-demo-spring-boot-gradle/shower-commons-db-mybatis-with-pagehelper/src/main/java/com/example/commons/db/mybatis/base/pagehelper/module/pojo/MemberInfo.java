package com.example.commons.db.mybatis.base.pagehelper.module.pojo;

import com.example.commons.db.mybatis.base.pagehelper.commons.pojo.CommonsEntity;
import lombok.*;

import java.io.Serializable;

/**
 * member_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberInfo extends CommonsEntity implements Serializable {
    /**
     * 会员编号
     */
    private String code;

    /**
     * 会员ID
     */
    private Long customerId;

    /**
     * 会员姓名
     */
    private String customerName;

    private static final long serialVersionUID = 1L;

}