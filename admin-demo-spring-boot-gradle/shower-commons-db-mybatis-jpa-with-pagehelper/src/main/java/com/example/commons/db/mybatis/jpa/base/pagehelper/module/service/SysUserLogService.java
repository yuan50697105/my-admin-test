package com.example.commons.db.mybatis.jpa.base.pagehelper.module.service;

import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.SysUserLog;
import java.util.List;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.SysUserLogExample;
public interface SysUserLogService{


    long countByExample(SysUserLogExample example);

    int deleteByExample(SysUserLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUserLog record);

    int insertSelective(SysUserLog record);

    List<SysUserLog> selectByExample(SysUserLogExample example);

    SysUserLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysUserLog record,SysUserLogExample example);

    int updateByExample(SysUserLog record,SysUserLogExample example);

    int updateByPrimaryKeySelective(SysUserLog record);

    int updateByPrimaryKey(SysUserLog record);

    int updateBatch(List<SysUserLog> list);

    int updateBatchSelective(List<SysUserLog> list);

    int batchInsert(List<SysUserLog> list);

}
