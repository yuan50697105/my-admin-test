package com.example.commons.db.mybatis.base.sqlhelper.test.service.impl;

import com.example.commons.db.mybatis.base.sqlhelper.test.pojo.SysUserLog;
import com.example.commons.db.mybatis.base.sqlhelper.test.pojo.SysUserLogExample;

import java.util.List;
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

}
