package com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.mapper;

import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.pojo.CustomerInfo;
import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.pojo.CustomerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomerInfoMapper {
    long countByExample(CustomerInfoExample example);

    int deleteByExample(CustomerInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustomerInfo record);

    int insertSelective(CustomerInfo record);

    List<CustomerInfo> selectByExample(CustomerInfoExample example);

    CustomerInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    int updateByExample(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    int updateByPrimaryKeySelective(CustomerInfo record);

    int updateByPrimaryKey(CustomerInfo record);

    int updateBatch(List<CustomerInfo> list);

    int updateBatchSelective(List<CustomerInfo> list);

    int batchInsert(@Param("list") List<CustomerInfo> list);
}