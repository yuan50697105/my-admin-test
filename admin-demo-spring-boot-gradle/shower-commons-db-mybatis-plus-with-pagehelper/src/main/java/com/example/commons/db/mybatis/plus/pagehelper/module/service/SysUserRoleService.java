package com.example.commons.db.mybatis.plus.pagehelper.module.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.SysUserRole;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.SysUserRoleExample;

import java.util.List;

public interface SysUserRoleService extends IService<SysUserRole> {


    int updateBatch(List<SysUserRole> list);

    int updateBatchSelective(List<SysUserRole> list);

    int batchInsert(List<SysUserRole> list);

    long countByExample(SysUserRoleExample example);

    int deleteByExample(SysUserRoleExample example);

    List<SysUserRole> selectByExample(SysUserRoleExample example);

    int updateByExampleSelective(SysUserRole record, SysUserRoleExample example);

    int updateByExample(SysUserRole record, SysUserRoleExample example);

    boolean removeByRoleId(Long roleId);

    boolean removeByRoleIds(List<Long> roleIds);

    boolean removeByUserId(Long userId);

    boolean removeByUserIds(List<Long> userIds);
}


