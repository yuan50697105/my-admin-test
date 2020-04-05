package com.example.commons.db.mybatis.ext.sqlhelper.test.dao;

import java.util.List;
import com.example.commons.db.mybatis.ext.sqlhelper.test.pojo.SysUser;
import com.example.commons.db.mybatis.ext.sqlhelper.test.pojo.SysUserExample;
public interface SysUserService{


    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysUser record,SysUserExample example);

    int updateByExample(SysUser record,SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

}
