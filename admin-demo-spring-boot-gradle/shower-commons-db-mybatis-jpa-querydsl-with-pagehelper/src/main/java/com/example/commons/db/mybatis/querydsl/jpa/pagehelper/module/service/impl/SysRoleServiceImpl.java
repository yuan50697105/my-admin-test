package com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.service.impl;

import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.mapper.SysRoleMapper;
import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.pojo.SysRole;
import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.pojo.SysRoleExample;
import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.service.SysRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;

    @Override
    public long countByExample(SysRoleExample example) {
        return sysRoleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysRoleExample example) {
        return sysRoleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysRole record) {
        return sysRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(SysRole record) {
        return sysRoleMapper.insertSelective(record);
    }

    @Override
    public List<SysRole> selectByExample(SysRoleExample example) {
        return sysRoleMapper.selectByExample(example);
    }

    @Override
    public SysRole selectByPrimaryKey(Long id) {
        return sysRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SysRole record, SysRoleExample example) {
        return sysRoleMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysRole record, SysRoleExample example) {
        return sysRoleMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SysRole record) {
        return sysRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysRole record) {
        return sysRoleMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<SysRole> list) {
        return sysRoleMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysRole> list) {
        return sysRoleMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysRole> list) {
        return sysRoleMapper.batchInsert(list);
    }

}


