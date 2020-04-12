package com.example.commons.db.mybatis.base.pagehelper.module.service.impl;

import java.util.List;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.GoodsTypeExample;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.GoodsType;
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

}
