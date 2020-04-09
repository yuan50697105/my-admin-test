package com.example.commons.db.mybatis.base.sqlhelper.test.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.example.commons.db.mybatis.base.sqlhelper.pojo.PageResult;
import com.example.commons.db.mybatis.base.sqlhelper.test.mapper.SysRoleMapper;
import com.example.commons.db.mybatis.base.sqlhelper.test.pojo.SysRole;
import com.example.commons.db.mybatis.base.sqlhelper.test.pojo.SysRoleExample;
import com.example.commons.db.mybatis.base.sqlhelper.test.pojo.query.SysRoleQuery;
import com.example.commons.db.mybatis.base.sqlhelper.test.service.SysRoleService;
import com.example.commons.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public int deleteByIds(List<Long> ids) {
        SysRoleExample example = new SysRoleExample();
        example.or().andIdIn(ids);
        return deleteByExample(example);
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
    public IPageResult<SysRole> selectPageByQuery(SysRoleQuery query) {
        SysRoleExample example = createExample(query);
        return selectPageByExample(example, query.getPage(), query.getSize());
    }

    @Override
    public IPageResult<SysRole> selectPageByExample(SysRoleExample example, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageResult<>(new PageInfo<>(selectByExample(example)));
    }

    @Override
    public List<SysRole> selectByQuery(SysRoleQuery query) {
        SysRoleExample example = createExample(query);
        return selectByExample(example);
    }


    public SysRoleExample createExample(SysRoleQuery query) {
        SysRoleExample example = new SysRoleExample();
        SysRoleExample.Criteria criteria = example.createCriteria();
        if (ObjectUtil.isNotEmpty(query.getName())) {
            criteria.andNameLike("%" + query.getName() + "%");
        }
        example.or(criteria);
        return example;
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
    public List<SysRole> selectByIds(List<Long> ids) {
        SysRoleExample example = new SysRoleExample();
        example.or().andIdIn(ids);
        return sysRoleMapper.selectByExample(example);
    }
}








