package com.example.commons.db.mybatis.mapper.ext.pagehelper.test.mapper;

import com.example.commons.db.mybatis.mapper.ext.pagehelper.test.pojo.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysRoleMapper extends tk.mybatis.mapper.common.Mapper<SysRole> {
    int updateBatch(List<SysRole> list);

    int updateBatchSelective(List<SysRole> list);

    int batchInsert(@Param("list") List<SysRole> list);
}