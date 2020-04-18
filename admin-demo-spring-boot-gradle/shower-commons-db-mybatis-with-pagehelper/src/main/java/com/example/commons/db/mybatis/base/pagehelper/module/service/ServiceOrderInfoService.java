package com.example.commons.db.mybatis.base.pagehelper.module.service;

import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceOrderInfo;
import java.util.List;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceOrderInfoExample;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.query.ServiceOrderInfoQuery;
import com.example.db.pojo.IPageResult;

public interface ServiceOrderInfoService{


    long countByExample(ServiceOrderInfoExample example);

    int deleteByExample(ServiceOrderInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServiceOrderInfo record);

    int insertSelective(ServiceOrderInfo record);

    List<ServiceOrderInfo> selectByExample(ServiceOrderInfoExample example);

    ServiceOrderInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(ServiceOrderInfo record,ServiceOrderInfoExample example);

    int updateByExample(ServiceOrderInfo record,ServiceOrderInfoExample example);

    int updateByPrimaryKeySelective(ServiceOrderInfo record);

    int updateByPrimaryKey(ServiceOrderInfo record);

    int updateBatch(List<ServiceOrderInfo> list);

    int updateBatchSelective(List<ServiceOrderInfo> list);

    int batchInsert(List<ServiceOrderInfo> list);

    IPageResult<ServiceOrderInfo> selectPageByQuery(ServiceOrderInfoQuery query);

    List<ServiceOrderInfo> selectByQuery(ServiceOrderInfoQuery query);

    List<ServiceOrderInfo> selectByPrimaryKeys(List<Long> ids);
}
