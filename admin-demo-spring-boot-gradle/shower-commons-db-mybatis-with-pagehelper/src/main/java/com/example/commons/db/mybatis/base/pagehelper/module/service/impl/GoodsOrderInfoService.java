package com.example.commons.db.mybatis.base.pagehelper.module.service.impl;

import java.util.List;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.GoodsOrderInfoExample;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.GoodsOrderInfo;
public interface GoodsOrderInfoService{


    long countByExample(GoodsOrderInfoExample example);

    int deleteByExample(GoodsOrderInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsOrderInfo record);

    int insertSelective(GoodsOrderInfo record);

    List<GoodsOrderInfo> selectByExample(GoodsOrderInfoExample example);

    GoodsOrderInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(GoodsOrderInfo record,GoodsOrderInfoExample example);

    int updateByExample(GoodsOrderInfo record,GoodsOrderInfoExample example);

    int updateByPrimaryKeySelective(GoodsOrderInfo record);

    int updateByPrimaryKey(GoodsOrderInfo record);

    int updateBatch(List<GoodsOrderInfo> list);

    int updateBatchSelective(List<GoodsOrderInfo> list);

    int batchInsert(List<GoodsOrderInfo> list);

}
