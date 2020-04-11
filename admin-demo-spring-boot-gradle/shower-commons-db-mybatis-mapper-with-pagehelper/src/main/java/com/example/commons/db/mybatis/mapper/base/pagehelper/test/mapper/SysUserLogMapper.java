package com.example.commons.db.mybatis.mapper.base.pagehelper.test.mapper;

import com.example.commons.db.mybatis.mapper.base.pagehelper.test.pojo.SysUserLog;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysUserLogMapper extends tk.mybatis.mapper.common.Mapper<SysUserLog> {
    int updateBatch(List<SysUserLog> list);

    int updateBatchSelective(List<SysUserLog> list);

    int batchInsert(@Param("list") List<SysUserLog> list);
}