package com.example.commons.db.mybatis.base.pagehelper.module.mapper;

import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceType;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ServiceTypeMapper {
    long countByExample(ServiceTypeExample example);

    int deleteByExample(ServiceTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServiceType record);

    int insertSelective(ServiceType record);

    List<ServiceType> selectByExample(ServiceTypeExample example);

    ServiceType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServiceType record, @Param("example") ServiceTypeExample example);

    int updateByExample(@Param("record") ServiceType record, @Param("example") ServiceTypeExample example);

    int updateByPrimaryKeySelective(ServiceType record);

    int updateByPrimaryKey(ServiceType record);

    int updateBatch(List<ServiceType> list);

    int updateBatchSelective(List<ServiceType> list);

    int batchInsert(@Param("list") List<ServiceType> list);
}