package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service;


import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.SysUserRole;

import java.util.List;

public interface SysUserRoleService {


    int updateBatch(List<SysUserRole> list);

    int updateBatchSelective(List<SysUserRole> list);

    int batchInsert(List<SysUserRole> list);

    int deleteByRoleId(Long roleId);

    int deleteByRoleIds(List<Long> roleIds);

    int deleteByUserId(Long userId);

    int deleteByUserIds(List<Long> userIds);
}

