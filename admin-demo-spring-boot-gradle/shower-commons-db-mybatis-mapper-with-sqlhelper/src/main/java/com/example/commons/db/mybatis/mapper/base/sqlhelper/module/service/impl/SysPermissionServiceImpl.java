package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.mapper.SysPermissionMapper;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.SysPermission;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.query.SysPermissionQuery;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service.SysPermissionService;
import com.example.commons.db.utils.DbUtils;
import com.example.commons.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.weekend.Weekend;

import javax.annotation.Resource;
import java.util.List;

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
        Example example = createExample(query);
        return new PageResult<>(new PageInfo<>(sysPermissionMapper.selectByExample(example)));
    }

    @Override
    public List<SysPermission> selectByQuery(SysPermissionQuery query) {
        return sysPermissionMapper.selectByExample(createExample(query));
    }

    @Override
    public List<SysPermission> selectByIds(List<Long> ids) {
        Weekend<SysPermission> example = new Weekend<>(SysPermission.class);
        example.and().andIn("id", ids);
        return sysPermissionMapper.selectByExample(example);
    }

    public Example createExample(SysPermissionQuery query) {
        Example example = new Example(SysPermission.class);
        if (ObjectUtil.isNotEmpty(query.getName())) {
            example.and().andLike("name", DbUtils.likeContains(query.getName()));
        }
        return example;
    }

}

