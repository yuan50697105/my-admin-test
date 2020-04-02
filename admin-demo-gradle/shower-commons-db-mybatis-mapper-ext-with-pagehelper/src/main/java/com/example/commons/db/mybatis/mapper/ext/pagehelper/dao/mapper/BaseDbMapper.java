package com.example.commons.db.mybatis.mapper.ext.pagehelper.dao.mapper;

import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;

@RegisterMapper
public interface BaseDbMapper<T> extends Mapper<T>, IdsMapper<T> {
}
