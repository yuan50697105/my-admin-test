package com.example.commons.db.mybatis.base.sqlhelper.module.pojo.query;

import com.example.commons.db.mybatis.base.sqlhelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.GoodsInfoExample;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndEqualTo;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 12:47
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GoodsInfoQuery extends CommonsQuery implements MybatisExample<GoodsInfoExample> {
    @AndEqualTo
    private Long typeId;
    @AndLike
    private String code;
    @AndLike
    private String name;
}