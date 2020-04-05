package com.example.commons.db.mybatis.ext.sqlhelper.test.dao;

import java.util.List;
import com.example.commons.db.mybatis.ext.sqlhelper.test.pojo.SysPermission;
import com.example.commons.db.mybatis.ext.sqlhelper.test.pojo.SysPermissionExample;
public interface SysPermissionService{


    long countByExample(SysPermissionExample example);

    int deleteByExample(SysPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    List<SysPermission> selectByExample(SysPermissionExample example);

    SysPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysPermission record,SysPermissionExample example);

    int updateByExample(SysPermission record,SysPermissionExample example);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);

}
