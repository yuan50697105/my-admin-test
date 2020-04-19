package com.example.commons.db.mybatis.base.pagehelper.module.pojo.query;

import com.example.commons.db.mybatis.base.pagehelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.MemberInfoExample;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * member_info
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MemberInfoQuery extends CommonsQuery implements MybatisExample<MemberInfoExample> {
    private static final long serialVersionUID = 1L;
    /**
     * 会员编号
     */
    @AndLike
    private String code;
    /**
     * 会员ID
     */
    @AndEqualTo
    private Long customerId;
    /**
     * 会员姓名
     */
    @AndLike
    private String customerName;
}