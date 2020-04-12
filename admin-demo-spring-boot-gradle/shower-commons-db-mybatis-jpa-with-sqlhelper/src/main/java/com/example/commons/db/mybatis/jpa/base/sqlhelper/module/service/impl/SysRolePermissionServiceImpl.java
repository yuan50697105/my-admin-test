package com.example.commons.db.mybatis.jpa.base.sqlhelper.module.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.commons.db.mybatis.jpa.base.sqlhelper.module.mapper.SysRolePermissionMapper;
import com.example.commons.db.mybatis.jpa.base.sqlhelper.module.pojo.SysRolePermissionExample;
import com.example.commons.db.mybatis.jpa.base.sqlhelper.module.pojo.SysRolePermission;
import com.example.commons.db.mybatis.jpa.base.sqlhelper.module.service.SysRolePermissionService;
@Service
public class SysRolePermissionServiceImpl implements SysRolePermissionService{

    @Resource
    private SysRolePermissionMapper sysRolePermissionMapper;

    @Override
    public long countByExample(SysRolePermissionExample example) {
        return sysRolePermissionMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysRolePermissionExample example) {
        return sysRolePermissionMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysRolePermissionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysRolePermission record) {
        return sysRolePermissionMapper.insert(record);
    }

    @Override
    public int insertSelective(SysRolePermission record) {
        return sysRolePermissionMapper.insertSelective(record);
    }

    @Override
    public List<SysRolePermission> selectByExample(SysRolePermissionExample example) {
        return sysRolePermissionMapper.selectByExample(example);
    }

    @Override
    public SysRolePermission selectByPrimaryKey(Long id) {
        return sysRolePermissionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SysRolePermission record,SysRolePermissionExample example) {
        return sysRolePermissionMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(SysRolePermission record,SysRolePermissionExample example) {
        return sysRolePermissionMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(SysRolePermission record) {
        return sysRolePermissionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysRolePermission record) {
        return sysRolePermissionMapper.updateByPrimaryKey(record);
    }

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

}
