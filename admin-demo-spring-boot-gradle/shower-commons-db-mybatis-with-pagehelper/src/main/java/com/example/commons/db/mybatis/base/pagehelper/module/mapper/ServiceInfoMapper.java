package com.example.commons.db.mybatis.base.pagehelper.module.mapper;

import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceInfo;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ServiceInfoMapper {
    long countByExample(ServiceInfoExample example);

    int deleteByExample(ServiceInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServiceInfo record);

    int insertSelective(ServiceInfo record);

    List<ServiceInfo> selectByExample(ServiceInfoExample example);

    ServiceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServiceInfo record, @Param("example") ServiceInfoExample example);

    int updateByExample(@Param("record") ServiceInfo record, @Param("example") ServiceInfoExample example);

    int updateByPrimaryKeySelective(ServiceInfo record);

    int updateByPrimaryKey(ServiceInfo record);

    int updateBatch(List<ServiceInfo> list);

    int updateBatchSelective(List<ServiceInfo> list);

    int batchInsert(@Param("list") List<ServiceInfo> list);
}