package com.example.commons.db.mybatis.jpa.base.sqlhelper.module.service.impl;

import com.example.commons.db.mybatis.jpa.base.pagehelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.mapper.SysRoleMapper;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.SysRole;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.SysRoleExample;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.query.SysRoleQuery;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.repository.SysRoleRepository;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.service.SysRoleService;
import com.example.commons.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysRoleServiceImpl implements SysRoleService{
    @Resource
    private SysRoleRepository sysRoleRepository;
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
    public int updateByExampleSelective(SysRole record,SysRoleExample example) {
        return sysRoleMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(SysRole record,SysRoleExample example) {
        return sysRoleMapper.updateByExample(record,example);
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

    @Override
    public int deleteByPrimaryKeys(List<Long> ids) {
        SysRoleExample example = new SysRoleExample();
        example.or().andIdIn(ids);
        return deleteByExample(example);
    }

    @Override
    public IPageResult<SysRole> selectPageByQuery(SysRoleQuery query) {
        PageHelper.startPage(query.getPage(), query.getSize());
        return new PageResult<>(new PageInfo<>(selectByExample(query.toExample())));
    }

    @Override
    public List<SysRole> selectByQuery(SysRoleQuery query) {
        return selectByExample(query.toExample());
    }

    @Override
    public List<SysRole> selectByPrimaryKeys(List<Long> ids) {
        SysRoleExample example = new SysRoleExample();
        example.or().andIdIn(ids);
        return selectByExample(example);
    }

}
