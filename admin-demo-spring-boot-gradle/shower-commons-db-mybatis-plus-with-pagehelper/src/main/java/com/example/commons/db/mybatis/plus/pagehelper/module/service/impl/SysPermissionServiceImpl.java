package com.example.commons.db.mybatis.plus.pagehelper.module.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.commons.db.mybatis.plus.pagehelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.plus.pagehelper.module.mapper.SysPermissionMapper;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.SysPermission;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.SysPermissionExample;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.query.SysPermissionQuery;
import com.example.commons.db.mybatis.plus.pagehelper.module.service.SysPermissionService;
import com.example.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    @Override
    public IPageResult<SysPermission> selectPageByQuery(SysPermissionQuery query) {
        PageHelper.startPage(query.getPage(), query.getSize());
        return new PageResult<>(new PageInfo<>(baseMapper.selectByExample(query.toExample())));
    }

    @Override
    public List<SysPermission> selectByQuery(SysPermissionQuery query) {
        return baseMapper.selectByExample(query.toExample());
    }
}


