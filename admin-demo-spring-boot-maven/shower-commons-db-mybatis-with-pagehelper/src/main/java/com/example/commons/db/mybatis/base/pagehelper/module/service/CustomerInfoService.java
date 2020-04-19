package com.example.commons.db.mybatis.base.pagehelper.module.service;

import com.example.commons.db.mybatis.base.pagehelper.module.pojo.CustomerInfo;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.CustomerInfoExample;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.query.CustomerInfoQuery;
import com.example.commons.db.pojo.IPageResult;

import java.util.List;

public interface CustomerInfoService{


    long countByExample(CustomerInfoExample example);

    int deleteByExample(CustomerInfoExample example);

    int deleteByPrimaryKey(Long id);

    int deleteByPrimaryKeys(List<Long> ids);

    int insert(CustomerInfo record);

    int insertSelective(CustomerInfo record);

    List<CustomerInfo> selectByExample(CustomerInfoExample example);

    CustomerInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(CustomerInfo record,CustomerInfoExample example);

    int updateByExample(CustomerInfo record,CustomerInfoExample example);

    int updateByPrimaryKeySelective(CustomerInfo record);

    int updateByPrimaryKey(CustomerInfo record);

    int updateBatch(List<CustomerInfo> list);

    int updateBatchSelective(List<CustomerInfo> list);

    int batchInsert(List<CustomerInfo> list);

    IPageResult<CustomerInfo> selectPageByQuery(CustomerInfoQuery query);

    List<CustomerInfo> selectByQuery(CustomerInfoQuery query);
}
