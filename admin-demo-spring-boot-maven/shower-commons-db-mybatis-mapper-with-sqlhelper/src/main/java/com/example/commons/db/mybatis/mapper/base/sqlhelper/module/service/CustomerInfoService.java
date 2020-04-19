package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.CustomerInfo;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.query.CustomerInfoQuery;
import com.example.commons.db.pojo.IPageResult;

import java.util.List;

public interface CustomerInfoService{


    int updateBatch(List<CustomerInfo> list);

    int updateBatchSelective(List<CustomerInfo> list);

    int batchInsert(List<CustomerInfo> list);

    IPageResult<CustomerInfo> selectPageByQuery(CustomerInfoQuery query);

    List<CustomerInfo> selectByQuery(CustomerInfoQuery query);

    CustomerInfo selectByPrimaryKey(Long id);

    int insert(CustomerInfo customerInfo);

    int updateByPrimaryKeySelective(CustomerInfo customerInfo);

    int deleteByPrimaryKey(Long id);

    int deleteByPrimaryKeys(List<Long> ids);
}
