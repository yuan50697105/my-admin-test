package com.example.commons.db.mybatis.sqlhelper.test.dao;

import java.util.List;
import com.example.commons.db.mybatis.sqlhelper.test.pojo.SysRole;
import com.example.commons.db.mybatis.sqlhelper.test.pojo.SysRoleExample;
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
