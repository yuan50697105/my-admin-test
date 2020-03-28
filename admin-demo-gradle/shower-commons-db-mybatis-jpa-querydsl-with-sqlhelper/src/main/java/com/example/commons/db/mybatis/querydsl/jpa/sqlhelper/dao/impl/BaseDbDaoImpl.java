package com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.dao.impl;

import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.dao.BaseDbDao;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.mapper.BaseDbMapper;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.pojo.PageResult;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.repository.BaseDbRepository;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseDbDaoImpl<T, ID, M extends BaseDbMapper<T>, R extends BaseDbRepository<T, ID>> implements BaseDbDao<T, ID> {
    @Autowired
    protected M baseMapper;
    @Autowired
    protected R baseRepository;

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
