package com.example.commons.db.mybatis.base.pagehelper.test.service;

import com.example.commons.db.mybatis.base.pagehelper.test.pojo.GoodsType;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.GoodsTypeExample;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.query.GoodsTypeQuery;
import com.example.commons.db.pojo.IPageResult;

import java.util.List;

public interface GoodsTypeService{


    long countByExample(GoodsTypeExample example);

    int deleteByExample(GoodsTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    List<GoodsType> selectByExample(GoodsTypeExample example);

    GoodsType selectByPrimaryKey(Long id);

    int updateByExampleSelective(GoodsType record,GoodsTypeExample example);

    int updateByExample(GoodsType record,GoodsTypeExample example);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);

    int updateBatch(List<GoodsType> list);

    int updateBatchSelective(List<GoodsType> list);

    int batchInsert(List<GoodsType> list);

    IPageResult<GoodsType> selectPageByQuery(GoodsTypeQuery query);

    List<GoodsType> selectByQuery(GoodsTypeQuery query);

    int deleteByIds(List<Long> ids);
}
