package com.example.commons.db.mybatis.querydsl.jpa.pagehelper.dao.impl;

import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.dao.BaseDao;
import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.mapper.BaseDbMapper;
import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.pojo.PageResult;
import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.repository.BaseDbRepository;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseDaoImpl<T, ID, M extends BaseDbMapper<T>, R extends BaseDbRepository<T, ID>> implements BaseDao<T, ID> {
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
