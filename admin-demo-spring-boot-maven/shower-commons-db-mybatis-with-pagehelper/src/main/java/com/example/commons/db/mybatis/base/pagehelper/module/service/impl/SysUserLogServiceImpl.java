package com.example.commons.db.mybatis.base.pagehelper.module.service.impl;

import com.example.commons.db.mybatis.base.pagehelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.base.pagehelper.module.mapper.SysUserLogMapper;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysUserLog;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysUserLogExample;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.query.SysUserLogQuery;
import com.example.commons.db.mybatis.base.pagehelper.module.service.SysUserLogService;
import com.example.commons.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserLogServiceImpl implements SysUserLogService {

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
    public int updateByExampleSelective(SysUserLog record, SysUserLogExample example) {
        return sysUserLogMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysUserLog record, SysUserLogExample example) {
        return sysUserLogMapper.updateByExample(record, example);
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
    public IPageResult<SysUserLog> selectPageByQuery(SysUserLogQuery query) {
        return selectPageByExample(query.toExample(), query.getPage(), query.getSize());
    }

    @Override
    public IPageResult<SysUserLog> selectPageByExample(SysUserLogExample example, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageResult<>(new PageInfo<>(selectByExample(example)));
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







