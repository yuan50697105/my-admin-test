package com.example.commons.db.mybatis.mapper.ext.pagehelper.test.service.impl;

import com.example.commons.db.mybatis.mapper.ext.pagehelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.mapper.ext.pagehelper.test.mapper.SysPermissionMapper;
import com.example.commons.db.mybatis.mapper.ext.pagehelper.test.pojo.SysPermission;
import com.example.commons.db.mybatis.mapper.ext.pagehelper.test.pojo.query.SysPermissionQuery;
import com.example.commons.db.mybatis.mapper.ext.pagehelper.test.service.SysPermissionService;
import com.example.commons.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;import java.util.List;

@Service
public class SysPermissionServiceImpl implements SysPermissionService {

    @Resource
    private SysPermissionMapper sysPermissionMapper;

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
    public int insert(SysPermission sysPermission) {
        return sysPermissionMapper.insert(sysPermission);
    }

    @Override
    public SysPermission selectByPrimaryKey(Long id) {
        return sysPermissionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysPermission sysPermission) {
        return sysPermissionMapper.updateByPrimaryKeySelective(sysPermission);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysPermissionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(List<Long> ids) {
        Example example = new Example(SysPermission.class);
        example.and().andIn("id", ids);
        return sysPermissionMapper.deleteByExample(example);
    }

    @Override
    public IPageResult<SysPermission> selectPageByQuery(SysPermissionQuery query) {
        PageHelper.startPage(query.getPage(), query.getSize());
        return new PageResult<>(new PageInfo<>(sysPermissionMapper.selectByExample(query.toExample())));
    }

    @Override
    public List<SysPermission> selectByQuery(SysPermissionQuery query) {
        return sysPermissionMapper.selectByExample(query.toExample());
    }

    @Override
    public List<SysPermission> selectByIds(List<Long> ids) {
        Example example = new Example(SysPermission.class);
        example.and().andIn("id", ids);
        return sysPermissionMapper.selectByExample(example);
    }
}

