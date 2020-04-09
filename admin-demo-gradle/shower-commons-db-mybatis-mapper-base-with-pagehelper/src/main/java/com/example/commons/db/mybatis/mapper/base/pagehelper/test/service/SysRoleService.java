package com.example.commons.db.mybatis.mapper.base.pagehelper.test.service;

import com.example.commons.db.mybatis.mapper.base.pagehelper.test.pojo.SysRole;
import com.example.commons.db.mybatis.mapper.base.pagehelper.test.pojo.query.SysRoleQuery;
import com.example.commons.db.pojo.IPageResult;

import java.util.List;

public interface SysRoleService{


    int insert(SysRole sysRole);

    SysRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRole sysRole);

    int deleteByPrimaryKey(Long id);

    int deleteByIds(List<Long> ids);

    IPageResult<SysRole> selectPageByQuery(SysRoleQuery query);

    List<SysRole> selectByQuery(SysRoleQuery query);

    List<SysRole> selectByExample(Object object);

    IPageResult<SysRole> selectPageByExample(Object object, int page, int size);
}
