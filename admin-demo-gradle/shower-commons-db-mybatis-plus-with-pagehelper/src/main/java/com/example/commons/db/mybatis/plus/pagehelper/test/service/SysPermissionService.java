package com.example.commons.db.mybatis.plus.pagehelper.test.service;

import java.util.List;
import com.example.commons.db.mybatis.plus.pagehelper.test.pojo.SysPermission;
import com.baomidou.mybatisplus.extension.service.IService;

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

