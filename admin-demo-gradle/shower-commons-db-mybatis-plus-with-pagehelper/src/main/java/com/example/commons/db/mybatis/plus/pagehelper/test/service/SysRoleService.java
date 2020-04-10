package com.example.commons.db.mybatis.plus.pagehelper.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.commons.db.mybatis.plus.pagehelper.test.pojo.SysRole;
import com.example.commons.db.mybatis.plus.pagehelper.test.pojo.SysRoleExample;
import com.example.commons.db.mybatis.plus.pagehelper.test.pojo.query.SysRoleQuery;
import com.example.commons.db.pojo.IPageResult;

import java.util.List;

public interface SysRoleService extends IService<SysRole> {


    int updateBatch(List<SysRole> list);

    int updateBatchSelective(List<SysRole> list);

    int batchInsert(List<SysRole> list);

    long countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    List<SysRole> selectByExample(SysRoleExample example);

    int updateByExampleSelective(SysRole record, SysRoleExample example);

    int updateByExample(SysRole record, SysRoleExample example);

    int insert(SysRole sysRole);

    SysRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRole sysRole);

    int deleteByPrimaryKey(Long id);

    boolean deleteByIds(List<Long> ids);

    IPageResult<SysRole> selectPageByQuery(SysRoleQuery query);

    List<SysRole> selectByQuery(SysRoleQuery query);
}

