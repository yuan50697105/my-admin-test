package com.example.commons.db.mybatis.base.pagehelper.test.service;

import java.util.List;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.SysRoleExample;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.SysRole;
public interface SysRoleService{


    long countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysRole record,SysRoleExample example);

    int updateByExample(SysRole record,SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

}
