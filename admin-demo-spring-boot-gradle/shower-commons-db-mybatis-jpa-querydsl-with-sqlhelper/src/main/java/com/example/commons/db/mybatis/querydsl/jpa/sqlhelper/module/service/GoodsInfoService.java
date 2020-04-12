package com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.service;

import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.pojo.GoodsInfo;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.pojo.GoodsInfoExample;

import java.util.List;

public interface GoodsInfoService {


    long countByExample(GoodsInfoExample example);

    int deleteByExample(GoodsInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsInfo record);

    int insertSelective(GoodsInfo record);

    List<GoodsInfo> selectByExample(GoodsInfoExample example);

    GoodsInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(GoodsInfo record, GoodsInfoExample example);

    int updateByExample(GoodsInfo record, GoodsInfoExample example);

    int updateByPrimaryKeySelective(GoodsInfo record);

    int updateByPrimaryKey(GoodsInfo record);

    int updateBatch(List<GoodsInfo> list);

    int updateBatchSelective(List<GoodsInfo> list);

    int batchInsert(List<GoodsInfo> list);

}

