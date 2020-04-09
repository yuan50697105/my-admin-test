package com.example.commons.db.mybatis.base.pagehelper.test.service.impl;

import com.example.commons.db.mybatis.base.pagehelper.test.service.SysPermissionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.commons.db.mybatis.base.pagehelper.test.mapper.SysPermissionMapper;
import java.util.List;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.SysPermission;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.SysPermissionExample;

@Service
public class SysPermissionServiceImpl implements SysPermissionService {

    @Resource
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public long countByExample(SysPermissionExample example) {
        return sysPermissionMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysPermissionExample example) {
        return sysPermissionMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysPermissionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysPermission record) {
        return sysPermissionMapper.insert(record);
    }

    @Override
    public int insertSelective(SysPermission record) {
        return sysPermissionMapper.insertSelective(record);
    }

    @Override
    public List<SysPermission> selectByExample(SysPermissionExample example) {
        return sysPermissionMapper.selectByExample(example);
    }

    @Override
    public SysPermission selectByPrimaryKey(Long id) {
        return sysPermissionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SysPermission record, SysPermissionExample example) {
        return sysPermissionMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysPermission record, SysPermissionExample example) {
        return sysPermissionMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SysPermission record) {
        return sysPermissionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysPermission record) {
        return sysPermissionMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SysPermission> list) {
        return sysPermissionMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysPermission> list) {
        return sysPermissionMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysPermission> list) {
        return sysPermissionMapper.batchInsert(list);
    }

    @Override
    public List<SysPermission> selectByIds(List<Long> ids) {
        SysPermissionExample example = new SysPermissionExample();
        example.or().andIdIn(ids);
        return sysPermissionMapper.selectByExample(example);
    }
}






