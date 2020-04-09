package com.example.commons.db.mybatis.jpa.sqlhelper.dao.impl;

import com.example.commons.db.mybatis.jpa.sqlhelper.dao.BaseDao;
import com.example.commons.db.mybatis.jpa.sqlhelper.mapper.BaseMapper;
import com.example.commons.db.mybatis.jpa.sqlhelper.pojo.PageResult;
import com.example.commons.db.mybatis.jpa.sqlhelper.repository.BaseRepository;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseDaoImpl<T, ID, M extends BaseMapper<T>, R extends BaseRepository<T, ID>> implements BaseDao<T, ID> {
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
