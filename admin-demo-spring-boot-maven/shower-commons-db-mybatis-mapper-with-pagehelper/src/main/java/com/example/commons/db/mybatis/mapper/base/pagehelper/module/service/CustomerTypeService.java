package com.example.commons.db.mybatis.mapper.base.pagehelper.module.service;

import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.CustomerType;
import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.query.CustomerTypeQuery;
import com.example.commons.db.pojo.IPageResult;

import java.util.List;
public interface CustomerTypeService{


    int updateBatch(List<CustomerType> list);

    int updateBatchSelective(List<CustomerType> list);

    int batchInsert(List<CustomerType> list);

    IPageResult<CustomerType> selectPageByQuery(CustomerTypeQuery query);

    List<CustomerType> selectByQuery(CustomerTypeQuery query);

    CustomerType selectByPrimaryKey(Long id);

    int insert(CustomerType customerType);

    int updateByPrimaryKeySelective(CustomerType customerType);

    int deleteByPrimaryKey(Long id);

    int deleteByPrimaryKeys(List<Long> ids);
}
