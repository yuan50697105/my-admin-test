package com.example.commons.db.mybatis.pagehelper.dao.impl;

import com.example.commons.db.mybatis.pagehelper.dao.BaseDao;
import com.example.commons.db.mybatis.pagehelper.mapper.BaseMapper;
import com.example.commons.db.mybatis.pagehelper.pojo.PageResult;
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
