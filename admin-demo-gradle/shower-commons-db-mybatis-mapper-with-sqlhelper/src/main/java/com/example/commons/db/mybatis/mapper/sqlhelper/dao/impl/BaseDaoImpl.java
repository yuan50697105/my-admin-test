package com.example.commons.db.mybatis.mapper.sqlhelper.dao.impl;

import com.example.commons.db.mybatis.mapper.sqlhelper.dao.BaseDao;
import com.example.commons.db.mybatis.mapper.sqlhelper.pojo.PageResult;
import com.github.pagehelper.PageInfo;

import java.util.List;

public class BaseDaoImpl<T> implements BaseDao<T> {
    public String likeContains(String str) {
        return "%" + str + "%";
    }

    public PageResult<T> pageResult(PageInfo<T> pageInfo) {
        return new PageResult<>(pageInfo);
    }

    public PageResult<T> pageResult(List<T> list) {
        return pageResult(PageInfo.of(list));
    }

}