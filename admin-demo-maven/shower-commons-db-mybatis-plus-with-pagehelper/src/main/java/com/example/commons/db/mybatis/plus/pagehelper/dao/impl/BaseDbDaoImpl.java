package com.example.commons.db.mybatis.plus.pagehelper.dao.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.commons.db.mybatis.plus.pagehelper.dao.BaseDbDao;
import com.example.commons.db.mybatis.plus.pagehelper.mapper.BaseDbMapper;
import com.example.commons.db.mybatis.plus.pagehelper.pojo.PageResult;
import com.github.pagehelper.PageInfo;

import java.util.List;

public class BaseDbDaoImpl<T, ID, M extends BaseDbMapper<T>> extends ServiceImpl<M, T> implements BaseDbDao<T, ID> {
    public String likeContains(String str) {
        return "%" + str + "%";
    }

    public PageResult<T> pageResult(PageInfo<T> pageInfo) {
        return new PageResult<>(pageInfo);
    }

    public PageResult<T> pageResult(List<T> list) {
        return pageResult(PageInfo.of(list));
    }

    public PageResult<T> pageResult(IPage<T> iPage) {
        return new PageResult<>(iPage);
    }
}
