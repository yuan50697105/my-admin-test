package com.example.commons.db.mybatis.plus.pagehelper.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.commons.db.mybatis.plus.pagehelper.test.pojo.SysRole;
import com.example.commons.db.mybatis.plus.pagehelper.test.pojo.SysRoleExample;

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
}

