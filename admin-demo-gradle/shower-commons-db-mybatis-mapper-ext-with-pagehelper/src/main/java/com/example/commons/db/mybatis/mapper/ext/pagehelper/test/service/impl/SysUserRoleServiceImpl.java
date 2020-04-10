package com.example.commons.db.mybatis.mapper.ext.pagehelper.test.service.impl;

import com.example.commons.db.mybatis.mapper.ext.pagehelper.test.mapper.SysUserRoleMapper;
import com.example.commons.db.mybatis.mapper.ext.pagehelper.test.pojo.SysUserRole;
import com.example.commons.db.mybatis.mapper.ext.pagehelper.test.service.SysUserRoleService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserRoleServiceImpl implements SysUserRoleService{

    @Resource
    private SysUserRoleMapper sysUserRoleMapper;

    @Override
    public int updateBatch(List<SysUserRole> list) {
        return sysUserRoleMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysUserRole> list) {
        return sysUserRoleMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysUserRole> list) {
        return sysUserRoleMapper.batchInsert(list);
    }

    @Override
    public int deleteByRoleId(Long roleId) {
        Example example = new Example(SysUserRole.class);
        example.and().andEqualTo("roleId", roleId);
        return sysUserRoleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByRoleIds(List<Long> roleIds) {
        Example example = new Example(SysUserRole.class);
        example.and().andIn("roleId", roleIds);
        return sysUserRoleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByUserId(Long userId) {
        Example example = new Example(SysUserRole.class);
        example.and().andEqualTo("userId", userId);
        return sysUserRoleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByUserIds(List<Long> userIds) {
        Example example = new Example(SysUserRole.class);
        example.and().andIn("userId", userIds);
        return sysUserRoleMapper.deleteByExample(example);
    }

}
