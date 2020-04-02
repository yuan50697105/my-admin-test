package com.example.commons.db.mybatis.ext.pagehelper.dao.impl;

import com.example.commons.db.mybatis.ext.pagehelper.dao.BaseDbDao;
import com.example.commons.db.mybatis.ext.pagehelper.mapper.BaseDbMapper;
import com.example.commons.db.mybatis.ext.pagehelper.pojo.PageResult;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseDbDaoImpl<T, ID, M extends BaseDbMapper<T>> implements BaseDbDao<T, ID> {
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
