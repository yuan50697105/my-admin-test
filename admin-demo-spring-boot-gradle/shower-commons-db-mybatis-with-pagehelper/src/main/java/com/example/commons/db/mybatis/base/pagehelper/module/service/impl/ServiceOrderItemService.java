package com.example.commons.db.mybatis.base.pagehelper.module.service.impl;

import java.util.List;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceOrderItem;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceOrderItemExample;
public interface ServiceOrderItemService{


    long countByExample(ServiceOrderItemExample example);

    int deleteByExample(ServiceOrderItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServiceOrderItem record);

    int insertSelective(ServiceOrderItem record);

    List<ServiceOrderItem> selectByExample(ServiceOrderItemExample example);

    ServiceOrderItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(ServiceOrderItem record,ServiceOrderItemExample example);

    int updateByExample(ServiceOrderItem record,ServiceOrderItemExample example);

    int updateByPrimaryKeySelective(ServiceOrderItem record);

    int updateByPrimaryKey(ServiceOrderItem record);

    int updateBatch(List<ServiceOrderItem> list);

    int updateBatchSelective(List<ServiceOrderItem> list);

    int batchInsert(List<ServiceOrderItem> list);

}
