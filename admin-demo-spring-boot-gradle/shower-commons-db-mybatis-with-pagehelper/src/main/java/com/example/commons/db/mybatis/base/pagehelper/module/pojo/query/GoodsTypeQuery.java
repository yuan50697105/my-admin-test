package com.example.commons.db.mybatis.base.pagehelper.module.pojo.query;

import com.example.commons.db.mybatis.base.pagehelper.commons.pojo.query.CommonsQuery;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.GoodsTypeExample;
import com.gitee.denger.mybatis.example.ext.MybatisExample;
import com.gitee.denger.mybatis.example.ext.annotation.AndLike;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 13:34
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GoodsTypeQuery extends CommonsQuery implements MybatisExample<GoodsTypeExample> {
    @AndLike
    private String code;
    @AndLike
    private String name;
}