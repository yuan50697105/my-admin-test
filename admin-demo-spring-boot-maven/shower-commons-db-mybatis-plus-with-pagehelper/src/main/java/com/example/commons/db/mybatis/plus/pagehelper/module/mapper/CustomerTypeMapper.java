package com.example.commons.db.mybatis.plus.pagehelper.module.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.CustomerType;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.CustomerTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomerTypeMapper extends BaseMapper<CustomerType> {
    long countByExample(CustomerTypeExample example);

    int deleteByExample(CustomerTypeExample example);

    List<CustomerType> selectByExample(CustomerTypeExample example);

    int updateByExampleSelective(@Param("record") CustomerType record, @Param("example") CustomerTypeExample example);

    int updateByExample(@Param("record") CustomerType record, @Param("example") CustomerTypeExample example);

    int updateBatch(List<CustomerType> list);

    int updateBatchSelective(List<CustomerType> list);

    int batchInsert(@Param("list") List<CustomerType> list);
}