package com.example.commons.db.mybatis.pagehelper.test.dao;

import com.example.commons.db.mybatis.pagehelper.test.pojo.SysUserLog;import java.util.List;

public interface SysUserLogService {


    int deleteByPrimaryKey(Long id);

    int insert(SysUserLog record);

    int insertSelective(SysUserLog record);

    SysUserLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUserLog record);

    int updateByPrimaryKey(SysUserLog record);

    long countByExample(SysUserLogExample example);

    int deleteByExample(SysUserLogExample example);

    List<SysUserLog> selectByExample(SysUserLogExample example);

    int updateByExampleSelective(SysUserLog record, SysUserLogExample example);

    int updateByExample(SysUserLog record, SysUserLogExample example);
}

