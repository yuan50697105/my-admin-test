package com.example.commons.db.mybatis.base.pagehelper.module.mapper;

import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceOrderInfo;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.ServiceOrderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ServiceOrderInfoMapper {
    long countByExample(ServiceOrderInfoExample example);

    int deleteByExample(ServiceOrderInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServiceOrderInfo record);

    int insertSelective(ServiceOrderInfo record);

    List<ServiceOrderInfo> selectByExample(ServiceOrderInfoExample example);

    ServiceOrderInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServiceOrderInfo record, @Param("example") ServiceOrderInfoExample example);

    int updateByExample(@Param("record") ServiceOrderInfo record, @Param("example") ServiceOrderInfoExample example);

    int updateByPrimaryKeySelective(ServiceOrderInfo record);

    int updateByPrimaryKey(ServiceOrderInfo record);

    int updateBatch(List<ServiceOrderInfo> list);

    int updateBatchSelective(List<ServiceOrderInfo> list);

    int batchInsert(@Param("list") List<ServiceOrderInfo> list);
}