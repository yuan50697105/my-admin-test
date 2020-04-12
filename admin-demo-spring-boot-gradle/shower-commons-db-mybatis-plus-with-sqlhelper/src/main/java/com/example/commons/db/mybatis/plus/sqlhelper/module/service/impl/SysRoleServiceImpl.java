package com.example.commons.db.mybatis.plus.sqlhelper.module.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.commons.db.mybatis.plus.sqlhelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.plus.sqlhelper.module.mapper.SysRoleMapper;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.SysRole;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.SysRoleExample;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.query.SysRoleQuery;
import com.example.commons.db.mybatis.plus.sqlhelper.module.service.SysRoleService;
import com.example.db.pojo.IPageResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Override
    public int updateBatch(List<SysRole> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysRole> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysRole> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public long countByExample(SysRoleExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysRoleExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<SysRole> selectByExample(SysRoleExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(SysRole record, SysRoleExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysRole record, SysRoleExample example) {
        return baseMapper.updateByExample(record, example);
    }

    @Override
    public int insert(SysRole sysRole) {
        return baseMapper.insert(sysRole);
    }

    @Override
    public SysRole selectById(Long id) {
        return getById(id);
    }


    @Override
    public int deleteById(Long id) {
        return baseMapper.deleteById(id);
    }

    @Override
    public boolean deleteByIds(List<Long> ids) {
        return removeByIds(ids);
    }

    @Override
    public IPageResult<SysRole> selectPageByQuery(SysRoleQuery query) {
        QueryChainWrapper<SysRole> wrapper = createQuery(query);
        Page<SysRole> page = wrapper.page(new Page<>(query.getPage(), query.getSize()));
        return new PageResult<>(page);
    }

    @Override
    public List<SysRole> selectByQuery(SysRoleQuery query) {
        return createQuery(query).list();
    }

    public QueryChainWrapper<SysRole> createQuery(SysRoleQuery query) {
        QueryChainWrapper<SysRole> wrapper = query();
        if (ObjectUtil.isNotEmpty(query.getName())) {
            wrapper.like("name", query.getName());
        }
        return wrapper;
    }
}


