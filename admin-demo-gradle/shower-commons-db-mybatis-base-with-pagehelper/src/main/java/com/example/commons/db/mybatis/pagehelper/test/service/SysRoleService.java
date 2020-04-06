package com.example.commons.db.mybatis.pagehelper.test.service;

import java.util.List;
import com.example.commons.db.mybatis.pagehelper.test.pojo.SysRoleExample;
import com.example.commons.db.mybatis.pagehelper.test.pojo.SysRole;
import com.example.commons.db.mybatis.pagehelper.test.pojo.query.SysRoleQuery;
import com.example.commons.db.pojo.IPageResult;

public interface SysRoleService{


    long countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(Long id);

    int deleteByIds(List<Long> ids);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(SysRole record,SysRoleExample example);

    int updateByExample(SysRole record,SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    IPageResult<SysRole> selectPageByQuery(SysRoleQuery query);

    IPageResult<SysRole> selectPageByExample(SysRoleExample example, int page, int size);

    List<SysRole> selectByQuery(SysRoleQuery query);
}
