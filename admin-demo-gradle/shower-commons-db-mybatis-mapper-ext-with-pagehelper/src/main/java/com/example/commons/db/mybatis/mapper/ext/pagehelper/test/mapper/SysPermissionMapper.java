package com.example.commons.db.mybatis.mapper.ext.pagehelper.test.mapper;

import com.example.commons.db.mybatis.mapper.ext.pagehelper.test.pojo.SysPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysPermissionMapper extends tk.mybatis.mapper.common.Mapper<SysPermission> {
    int updateBatch(List<SysPermission> list);

    int updateBatchSelective(List<SysPermission> list);

    int batchInsert(@Param("list") List<SysPermission> list);
}