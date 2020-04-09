package com.example.commons.db.mybatis.mapper.ext.pagehelper.test.mapper;

import com.example.commons.db.mybatis.mapper.ext.pagehelper.test.pojo.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysUserMapper extends tk.mybatis.mapper.common.Mapper<SysUser> {
    int updateBatch(List<SysUser> list);

    int updateBatchSelective(List<SysUser> list);

    int batchInsert(@Param("list") List<SysUser> list);
}