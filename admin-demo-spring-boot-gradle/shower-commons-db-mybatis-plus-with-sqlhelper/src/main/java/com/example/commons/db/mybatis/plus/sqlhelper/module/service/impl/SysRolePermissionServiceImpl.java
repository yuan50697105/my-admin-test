package com.example.commons.db.mybatis.plus.sqlhelper.module.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.commons.db.mybatis.plus.sqlhelper.module.mapper.SysRolePermissionMapper;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.SysRolePermission;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.SysRolePermissionExample;
import com.example.commons.db.mybatis.plus.sqlhelper.module.service.SysRolePermissionService;
@Service
public class SysRolePermissionServiceImpl extends ServiceImpl<SysRolePermissionMapper, SysRolePermission> implements SysRolePermissionService{

    @Override
    public long countByExample(SysRolePermissionExample example) {
        return baseMapper.countByExample(example);
    }
    @Override
    public int deleteByExample(SysRolePermissionExample example) {
        return baseMapper.deleteByExample(example);
    }
    @Override
    public List<SysRolePermission> selectByExample(SysRolePermissionExample example) {
        return baseMapper.selectByExample(example);
    }
    @Override
    public int updateByExampleSelective(SysRolePermission record,SysRolePermissionExample example) {
        return baseMapper.updateByExampleSelective(record,example);
    }
    @Override
    public int updateByExample(SysRolePermission record,SysRolePermissionExample example) {
        return baseMapper.updateByExample(record,example);
    }
    @Override
    public int updateBatch(List<SysRolePermission> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<SysRolePermission> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<SysRolePermission> list) {
        return baseMapper.batchInsert(list);
    }
}
