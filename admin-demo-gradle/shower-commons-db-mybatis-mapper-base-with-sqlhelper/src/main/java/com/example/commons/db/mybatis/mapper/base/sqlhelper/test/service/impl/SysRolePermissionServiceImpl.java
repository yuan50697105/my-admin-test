package com.example.commons.db.mybatis.mapper.base.sqlhelper.test.service.impl;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.test.mapper.SysRolePermissionMapper;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.test.pojo.SysRolePermission;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.test.service.SysRolePermissionService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysRolePermissionServiceImpl implements SysRolePermissionService {

    @Resource
    private SysRolePermissionMapper sysRolePermissionMapper;

    @Override
    public int updateBatch(List<SysRolePermission> list) {
        return sysRolePermissionMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysRolePermission> list) {
        return sysRolePermissionMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysRolePermission> list) {
        return sysRolePermissionMapper.batchInsert(list);
    }

    @Override
    public int deleteByRoleId(Long roleId) {
        Example example = new Example(SysRolePermission.class);
        example.and().andEqualTo("roleId", roleId);
        return sysRolePermissionMapper.deleteByExample(example);
    }

    @Override
    public int deleteByRoleIds(List<Long> roleIds) {
        Example example = new Example(SysRolePermission.class);
        example.and().andIn("roleId", roleIds);
        return sysRolePermissionMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPermissionId(Long permissionId) {
        Example example = new Example(SysRolePermission.class);
        example.and().andEqualTo("permissionId", permissionId);
        return sysRolePermissionMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPermissionIds(List<Long> permissionIds) {
        Example example = new Example(SysRolePermission.class);
        example.and().andIn("permissionId", permissionIds);
        return sysRolePermissionMapper.deleteByExample(example);
    }

}

