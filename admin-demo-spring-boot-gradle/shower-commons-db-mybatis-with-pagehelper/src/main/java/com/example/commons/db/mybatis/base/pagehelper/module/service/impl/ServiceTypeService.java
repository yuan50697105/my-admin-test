package com.example.commons.db.mybatis.base.pagehelper.module.service.impl;

import java.util.List;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceTypeExample;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceType;
public interface ServiceTypeService{


    long countByExample(ServiceTypeExample example);

    int deleteByExample(ServiceTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServiceType record);

    int insertSelective(ServiceType record);

    List<ServiceType> selectByExample(ServiceTypeExample example);

    ServiceType selectByPrimaryKey(Long id);

    int updateByExampleSelective(ServiceType record,ServiceTypeExample example);

    int updateByExample(ServiceType record,ServiceTypeExample example);

    int updateByPrimaryKeySelective(ServiceType record);

    int updateByPrimaryKey(ServiceType record);

    int updateBatch(List<ServiceType> list);

    int updateBatchSelective(List<ServiceType> list);

    int batchInsert(List<ServiceType> list);

}
