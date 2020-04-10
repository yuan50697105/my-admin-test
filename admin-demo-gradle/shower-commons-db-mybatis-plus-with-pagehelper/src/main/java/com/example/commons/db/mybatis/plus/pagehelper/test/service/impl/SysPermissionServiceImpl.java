package com.example.commons.db.mybatis.plus.pagehelper.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.commons.db.mybatis.plus.pagehelper.test.mapper.SysPermissionMapper;
import com.example.commons.db.mybatis.plus.pagehelper.test.pojo.SysPermission;
import com.example.commons.db.mybatis.plus.pagehelper.test.pojo.SysPermissionExample;
import com.example.commons.db.mybatis.plus.pagehelper.test.service.SysPermissionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionMapper, SysPermission> implements SysPermissionService {

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
    public int updateByExampleSelective(SysPermission record, SysPermissionExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysPermission record, SysPermissionExample example) {
        return baseMapper.updateByExample(record, example);
    }
}

