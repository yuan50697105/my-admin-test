package com.example.commons.db.mybatis.base.pagehelper.module.service;

import java.util.List;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceInfoExample;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceInfo;
public interface ServiceInfoService{


    long countByExample(ServiceInfoExample example);

    int deleteByExample(ServiceInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServiceInfo record);

    int insertSelective(ServiceInfo record);

    List<ServiceInfo> selectByExample(ServiceInfoExample example);

    ServiceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(ServiceInfo record,ServiceInfoExample example);

    int updateByExample(ServiceInfo record,ServiceInfoExample example);

    int updateByPrimaryKeySelective(ServiceInfo record);

    int updateByPrimaryKey(ServiceInfo record);

    int updateBatch(List<ServiceInfo> list);

    int updateBatchSelective(List<ServiceInfo> list);

    int batchInsert(List<ServiceInfo> list);

}
