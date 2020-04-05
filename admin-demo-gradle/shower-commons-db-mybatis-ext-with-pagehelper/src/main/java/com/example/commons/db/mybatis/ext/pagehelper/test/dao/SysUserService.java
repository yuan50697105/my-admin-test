package com.example.commons.db.mybatis.ext.pagehelper.test.dao;

import java.util.List;
import com.example.commons.db.mybatis.ext.pagehelper.test.pojo.SysUserExample;
import com.example.commons.db.mybatis.ext.pagehelper.test.pojo.SysUser;
import com.example.commons.db.mybatis.ext.pagehelper.test.pojo.SysUserQuery;
import com.example.commons.db.pojo.IPageResult;

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

    List<SysUser> selectListByQuery(SysUserQuery query);

    IPageResult<SysUser> selectPageByExample(SysUserExample example, int page, int size);

    IPageResult<SysUser> selectPageByQuery(SysUserQuery query);
}
