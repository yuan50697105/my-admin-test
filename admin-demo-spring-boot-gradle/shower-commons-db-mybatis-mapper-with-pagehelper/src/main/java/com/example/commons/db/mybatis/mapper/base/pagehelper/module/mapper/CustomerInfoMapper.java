package com.example.commons.db.mybatis.mapper.base.pagehelper.module.mapper;

import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.CustomerInfo;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomerInfoMapper extends tk.mybatis.mapper.common.Mapper<CustomerInfo> {
    int updateBatch(List<CustomerInfo> list);

    int updateBatchSelective(List<CustomerInfo> list);

    int batchInsert(@Param("list") List<CustomerInfo> list);
}