package com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.service;


import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.pojo.CustomerType;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.pojo.CustomerTypeExample;

import java.util.List;

public interface CustomerTypeService {


    long countByExample(CustomerTypeExample example);

    int deleteByExample(CustomerTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustomerType record);

    int insertSelective(CustomerType record);

    List<CustomerType> selectByExample(CustomerTypeExample example);

    CustomerType selectByPrimaryKey(Long id);

    int updateByExampleSelective(CustomerType record, CustomerTypeExample example);

    int updateByExample(CustomerType record, CustomerTypeExample example);

    int updateByPrimaryKeySelective(CustomerType record);

    int updateByPrimaryKey(CustomerType record);

    int updateBatch(List<CustomerType> list);

    int updateBatchSelective(List<CustomerType> list);

    int batchInsert(List<CustomerType> list);

}

