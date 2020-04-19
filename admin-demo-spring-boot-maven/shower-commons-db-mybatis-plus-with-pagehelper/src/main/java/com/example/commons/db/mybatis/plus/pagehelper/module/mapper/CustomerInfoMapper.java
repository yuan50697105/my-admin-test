package com.example.commons.db.mybatis.plus.pagehelper.module.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.CustomerInfo;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.CustomerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomerInfoMapper extends BaseMapper<CustomerInfo> {
    long countByExample(CustomerInfoExample example);

    int deleteByExample(CustomerInfoExample example);

    List<CustomerInfo> selectByExample(CustomerInfoExample example);

    int updateByExampleSelective(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    int updateByExample(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    int updateBatch(List<CustomerInfo> list);

    int updateBatchSelective(List<CustomerInfo> list);

    int batchInsert(@Param("list") List<CustomerInfo> list);
}