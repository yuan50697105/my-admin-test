package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.mapper;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.CustomerType;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomerTypeMapper extends tk.mybatis.mapper.common.Mapper<CustomerType> {
    int updateBatch(List<CustomerType> list);

    int updateBatchSelective(List<CustomerType> list);

    int batchInsert(@Param("list") List<CustomerType> list);
}