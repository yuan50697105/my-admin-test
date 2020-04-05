package com.example.commons.db.mybatis.pagehelper.test.dao;

import com.example.commons.db.mybatis.pagehelper.test.pojo.SysUser;
import com.example.commons.db.mybatis.pagehelper.test.pojo.example.SysUserExample;

import java.util.List;

public interface SysUserService {


    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    List<SysUser> selectByExample(SysUserExample example);

    int updateByExampleSelective(SysUser record, SysUserExample example);

    int updateByExample(SysUser record, SysUserExample example);
}

