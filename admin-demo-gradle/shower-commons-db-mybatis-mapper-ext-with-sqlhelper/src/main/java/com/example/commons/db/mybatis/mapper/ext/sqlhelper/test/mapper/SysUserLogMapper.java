package com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.mapper;

import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.pojo.SysUserLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysUserLogMapper extends tk.mybatis.mapper.common.Mapper<SysUserLog> {
    int updateBatch(List<SysUserLog> list);

    int updateBatchSelective(List<SysUserLog> list);

    int batchInsert(@Param("list") List<SysUserLog> list);
}