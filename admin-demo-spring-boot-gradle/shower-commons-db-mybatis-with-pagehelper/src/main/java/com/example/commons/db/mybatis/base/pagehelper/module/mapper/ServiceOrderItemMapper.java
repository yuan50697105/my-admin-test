package com.example.commons.db.mybatis.base.pagehelper.module.mapper;

import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceOrderItem;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceOrderItemExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ServiceOrderItemMapper {
    long countByExample(ServiceOrderItemExample example);

    int deleteByExample(ServiceOrderItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServiceOrderItem record);

    int insertSelective(ServiceOrderItem record);

    List<ServiceOrderItem> selectByExample(ServiceOrderItemExample example);

    ServiceOrderItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServiceOrderItem record, @Param("example") ServiceOrderItemExample example);

    int updateByExample(@Param("record") ServiceOrderItem record, @Param("example") ServiceOrderItemExample example);

    int updateByPrimaryKeySelective(ServiceOrderItem record);

    int updateByPrimaryKey(ServiceOrderItem record);

    int updateBatch(List<ServiceOrderItem> list);

    int updateBatchSelective(List<ServiceOrderItem> list);

    int batchInsert(@Param("list") List<ServiceOrderItem> list);
}