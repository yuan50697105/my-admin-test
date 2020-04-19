package com.example.commons.db.mybatis.base.sqlhelper.module.pojo;

import com.example.commons.db.mybatis.base.sqlhelper.commons.pojo.CommonsEntity;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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

    public static MemberInfoBuilder builder() {
        return new MemberInfoBuilder();
    }
}