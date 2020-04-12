package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.mapper.SysRoleMapper;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.SysRole;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.query.SysRoleQuery;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service.SysRoleService;
import com.example.commons.db.utils.DbUtils;
import com.example.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;

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
    public int insert(SysRole sysRole) {
        return sysRoleMapper.insert(sysRole);
    }

    @Override
    public SysRole selectByPrimaryKey(Long id) {
        return sysRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysRole sysRole) {
        return sysRoleMapper.updateByPrimaryKeySelective(sysRole);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(List<Long> ids) {
        Example example = new Example(SysRole.class);
        example.and().andIn("id", ids);
        return sysRoleMapper.deleteByExample(example);
    }

    @Override
    public IPageResult<SysRole> selectPageByQuery(SysRoleQuery query) {
        PageHelper.startPage(query.getPage(), query.getSize());
        Example example = createExample(query);
        return new PageResult<>(new PageInfo<>(sysRoleMapper.selectByExample(example)));
    }

    @Override
    public List<SysRole> selectByQuery(SysRoleQuery query) {
        return sysRoleMapper.selectByExample(createExample(query));
    }

    @Override
    public List<SysRole> selectByIds(List<Long> ids) {
        Example example = new Example(SysRole.class);
        example.and().andIn("id", ids);
        return sysRoleMapper.selectByExample(example);
    }

    public Example createExample(SysRoleQuery query) {
        Example example = new Example(SysRole.class);
        if (ObjectUtil.isNotEmpty(query.getName())) {
            example.and().andLike("name", DbUtils.likeContains(query.getName()));
        }
        return example;
    }

}

