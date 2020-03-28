package com.example.commons.db.mybatis.sqlhelper.dao.impl;

import com.example.commons.db.mybatis.sqlhelper.dao.BaseDao;
import com.example.commons.db.mybatis.sqlhelper.mapper.BaseMapper;
import com.example.commons.db.mybatis.sqlhelper.pojo.PageResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseDaoImpl<T, ID, M extends BaseMapper<T>> implements BaseDao<T, ID> {
    @Autowired
    protected M baseMapper;

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
