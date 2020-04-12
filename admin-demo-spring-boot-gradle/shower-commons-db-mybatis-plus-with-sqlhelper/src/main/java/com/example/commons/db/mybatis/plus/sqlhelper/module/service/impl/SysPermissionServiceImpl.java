package com.example.commons.db.mybatis.plus.sqlhelper.module.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.SysPermissionExample;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.SysPermission;
import com.example.commons.db.mybatis.plus.sqlhelper.module.mapper.SysPermissionMapper;
import com.example.commons.db.mybatis.plus.sqlhelper.module.service.SysPermissionService;
@Service
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionMapper, SysPermission> implements SysPermissionService{

    @Override
    public long countByExample(SysPermissionExample example) {
        return baseMapper.countByExample(example);
    }
    @Override
    public int deleteByExample(SysPermissionExample example) {
        return baseMapper.deleteByExample(example);
    }
    @Override
    public List<SysPermission> selectByExample(SysPermissionExample example) {
        return baseMapper.selectByExample(example);
    }
    @Override
    public int updateByExampleSelective(SysPermission record,SysPermissionExample example) {
        return baseMapper.updateByExampleSelective(record,example);
    }
    @Override
    public int updateByExample(SysPermission record,SysPermissionExample example) {
        return baseMapper.updateByExample(record,example);
    }
    @Override
    public int updateBatch(List<SysPermission> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<SysPermission> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<SysPermission> list) {
        return baseMapper.batchInsert(list);
    }
}
