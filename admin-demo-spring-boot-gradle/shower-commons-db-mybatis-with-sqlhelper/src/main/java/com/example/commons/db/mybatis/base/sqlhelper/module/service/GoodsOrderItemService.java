package com.example.commons.db.mybatis.base.sqlhelper.module.service;

import java.util.List;
import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.GoodsOrderItem;
import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.GoodsOrderItemExample;

public interface GoodsOrderItemService {


    long countByExample(GoodsOrderItemExample example);

    int deleteByExample(GoodsOrderItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsOrderItem record);

    int insertSelective(GoodsOrderItem record);

    List<GoodsOrderItem> selectByExample(GoodsOrderItemExample example);

    GoodsOrderItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(GoodsOrderItem record, GoodsOrderItemExample example);

    int updateByExample(GoodsOrderItem record, GoodsOrderItemExample example);

    int updateByPrimaryKeySelective(GoodsOrderItem record);

    int updateByPrimaryKey(GoodsOrderItem record);

    int updateBatch(List<GoodsOrderItem> list);

    int updateBatchSelective(List<GoodsOrderItem> list);

    int batchInsert(List<GoodsOrderItem> list);

}

