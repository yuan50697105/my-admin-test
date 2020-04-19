package com.example.commons.db.mybatis.mapper.base.pagehelper.module.service;

import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.GoodsInfo;
import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.query.GoodsInfoQuery;
import com.example.commons.db.pojo.IPageResult;

import java.util.List;
public interface GoodsInfoService{


    int updateBatch(List<GoodsInfo> list);

    int updateBatchSelective(List<GoodsInfo> list);

    int batchInsert(List<GoodsInfo> list);

    IPageResult<GoodsInfo> selectPageByQuery(GoodsInfoQuery query);

    List<GoodsInfo> selectByQuery(GoodsInfoQuery query);

    GoodsInfo selectById(Long id);

    int insert(GoodsInfo goodsInfo);

    int updateByPrimaryKeySelective(GoodsInfo goodsInfo);

    int deleteById(Long id);

    int deleteByIds(List<Long> ids);
}
