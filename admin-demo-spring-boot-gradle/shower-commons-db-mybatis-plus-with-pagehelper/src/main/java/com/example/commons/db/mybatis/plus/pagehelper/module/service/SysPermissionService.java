package com.example.commons.db.mybatis.plus.pagehelper.module.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.SysPermission;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.SysPermissionExample;

import java.util.List;

public interface SysPermissionService extends IService<SysPermission> {


    int updateBatch(List<SysPermission> list);

    int updateBatchSelective(List<SysPermission> list);

    int batchInsert(List<SysPermission> list);

    long countByExample(SysPermissionExample example);

    int deleteByExample(SysPermissionExample example);

    List<SysPermission> selectByExample(SysPermissionExample example);

    int updateByExampleSelective(SysPermission record, SysPermissionExample example);

    int updateByExample(SysPermission record, SysPermissionExample example);
}

