package com.example.commons.db.mybatis.mapper.base.pagehelper.module.service;

import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.GoodsType;
import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.query.GoodsTypeQuery;
import com.example.commons.db.pojo.IPageResult;

import java.util.List;

public interface GoodsTypeService{


    int updateBatch(List<GoodsType> list);

    int updateBatchSelective(List<GoodsType> list);

    int batchInsert(List<GoodsType> list);

    IPageResult<GoodsType> selectPageByQuery(GoodsTypeQuery query);

    List<GoodsType> selectByQuery(GoodsTypeQuery query);

    GoodsType selectByPrimaryKey(Long id);

    int insert(GoodsType goodsType);

    int updateByPrimaryKeySelective(GoodsType goodsType);

    int deleteByPrimaryKey(Long id);

    int deleteByPrimaryKeys(List<Long> ids);
}
