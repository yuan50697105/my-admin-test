package com.example.commons.db.mybatis.jpa.base.pagehelper.module.service.impl;

import com.example.commons.db.mybatis.jpa.base.pagehelper.module.repository.SysUserLogRepository;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.SysUserLog;
import java.util.List;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.mapper.SysUserLogMapper;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.SysUserLogExample;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.service.SysUserLogService;
@Service
public class SysUserLogServiceImpl implements SysUserLogService{
    @Resource
    private SysUserLogRepository sysUserLogRepository;
    @Resource
    private SysUserLogMapper sysUserLogMapper;

    @Override
    public long countByExample(SysUserLogExample example) {
        return sysUserLogMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysUserLogExample example) {
        return sysUserLogMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysUserLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysUserLog record) {
        return sysUserLogMapper.insert(record);
    }

    @Override
    public int insertSelective(SysUserLog record) {
        return sysUserLogMapper.insertSelective(record);
    }

    @Override
    public List<SysUserLog> selectByExample(SysUserLogExample example) {
        return sysUserLogMapper.selectByExample(example);
    }

    @Override
    public SysUserLog selectByPrimaryKey(Long id) {
        return sysUserLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SysUserLog record,SysUserLogExample example) {
        return sysUserLogMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(SysUserLog record,SysUserLogExample example) {
        return sysUserLogMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUserLog record) {
        return sysUserLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysUserLog record) {
        return sysUserLogMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SysUserLog> list) {
        return sysUserLogMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysUserLog> list) {
        return sysUserLogMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysUserLog> list) {
        return sysUserLogMapper.batchInsert(list);
    }

}
