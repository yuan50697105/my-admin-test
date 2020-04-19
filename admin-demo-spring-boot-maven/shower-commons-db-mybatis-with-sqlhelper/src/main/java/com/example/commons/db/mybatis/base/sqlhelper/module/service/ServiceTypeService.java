package com.example.commons.db.mybatis.base.sqlhelper.module.service;

import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.ServiceType;
import java.util.List;
import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.ServiceTypeExample;
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
