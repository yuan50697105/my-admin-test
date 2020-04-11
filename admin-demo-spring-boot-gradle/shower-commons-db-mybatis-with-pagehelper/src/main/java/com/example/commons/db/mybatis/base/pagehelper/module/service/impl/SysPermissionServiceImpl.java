package com.example.commons.db.mybatis.base.pagehelper.module.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.example.commons.db.mybatis.base.pagehelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.base.pagehelper.module.mapper.SysPermissionMapper;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysPermission;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysPermissionExample;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.query.SysPermissionQuery;
import com.example.commons.db.mybatis.base.pagehelper.module.service.SysPermissionService;
import com.example.db.pojo.IPageResult;
import com.example.commons.db.utils.DbUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public int deleteByIds(List<Long> ids) {
        SysPermissionExample example = new SysPermissionExample();
        example.or().andIdIn(ids);
        return deleteByExample(example);
    }

    @Override
    public IPageResult<SysPermission> selectPageByQuery(SysPermissionQuery query) {
        SysPermissionExample example = query.toExample();
        return selectPageByExample(example, query.getPage(), query.getSize());
    }

    @Override
    public List<SysPermission> selectByQuery(SysPermissionQuery query) {
        SysPermissionExample example = query.toExample();
        return selectByExample(example);
    }

    @Override
    public IPageResult<SysPermission> selectPageByExample(SysPermissionExample example, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        return new PageResult<>(new PageInfo<>(selectByExample(example)));
    }

    private SysPermissionExample createExample(SysPermissionQuery query) {
        SysPermissionExample example = new SysPermissionExample();
        SysPermissionExample.Criteria criteria = example.createCriteria();
        if (ObjectUtil.isNotEmpty(query.getName())) {
            criteria.andNameLike(DbUtils.likeContains(query.getName()));
        }
        return example;
    }
}






