package com.example.commons.db.mybatis.pagehelper.dao.impl;

import com.example.commons.db.mybatis.pagehelper.pojo.PageResult;
import com.example.commons.db.mybatis.pagehelper.dao.BaseDao;
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
