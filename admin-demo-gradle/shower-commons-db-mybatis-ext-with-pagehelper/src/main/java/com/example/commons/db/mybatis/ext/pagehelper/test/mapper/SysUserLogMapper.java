package com.example.commons.db.mybatis.ext.pagehelper.test.mapper;

import com.example.commons.db.mybatis.ext.pagehelper.test.pojo.SysUserLog;
import com.example.commons.db.mybatis.ext.pagehelper.test.pojo.SysUserLogExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysUserLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserLog record);

    int insertSelective(SysUserLog record);

    SysUserLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUserLog record);

    int updateByPrimaryKey(SysUserLog record);

    int updateBatch(List<SysUserLog> list);

    int updateBatchSelective(List<SysUserLog> list);

    int batchInsert(@Param("list") List<SysUserLog> list);

    long countByExample(SysUserLogExample example);

    int deleteByExample(SysUserLogExample example);

    List<SysUserLog> selectByExample(SysUserLogExample example);

    int updateByExampleSelective(@Param("record") SysUserLog record, @Param("example") SysUserLogExample example);

    int updateByExample(@Param("record") SysUserLog record, @Param("example") SysUserLogExample example);
}