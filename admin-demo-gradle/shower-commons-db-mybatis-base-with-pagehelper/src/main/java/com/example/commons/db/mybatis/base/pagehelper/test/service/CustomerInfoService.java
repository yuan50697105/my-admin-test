package com.example.commons.db.mybatis.base.pagehelper.test.service;

import java.util.List;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.CustomerInfo;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.CustomerInfoExample;
public interface CustomerInfoService{


    long countByExample(CustomerInfoExample example);

    int deleteByExample(CustomerInfoExample example);

    int deleteByPrimaryKey(Long id);

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

}