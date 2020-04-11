package com.example.commons.db.mybatis.plus.pagehelper.test.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.commons.db.mybatis.plus.pagehelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.plus.pagehelper.test.mapper.SysUserMapper;
import com.example.commons.db.mybatis.plus.pagehelper.test.pojo.SysUser;
import com.example.commons.db.mybatis.plus.pagehelper.test.pojo.SysUserExample;
import com.example.commons.db.mybatis.plus.pagehelper.test.pojo.query.SysUserQuery;
import com.example.commons.db.mybatis.plus.pagehelper.test.service.SysUserService;
import com.example.db.pojo.IPageResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public int updateBatch(List<SysUser> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysUser> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysUser> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public long countByExample(SysUserExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysUserExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<SysUser> selectByExample(SysUserExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(SysUser record, SysUserExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysUser record, SysUserExample example) {
        return baseMapper.updateByExample(record, example);
    }

    @Override
    public int insert(SysUser sysUser) {
        return baseMapper.insert(sysUser);
    }

    @Override
    public SysUser selectByPrimaryKey(Long id) {
        return getById(id);
    }

    @Override
    public boolean deleteByPrimaryKey(Long id) {
        return removeById(id);
    }

    @Override
    public boolean deleteByIds(List<Long> ids) {
        return removeByIds(ids);
    }

    @Override
    public IPageResult<SysUser> selectPageByQuery(SysUserQuery query) {
        QueryChainWrapper<SysUser> wrapper = createQuery(query);
        return new PageResult<>(wrapper.page(new Page<>(query.getPage(), query.getSize())));
    }

    @Override
    public List<SysUser> selectByQuery(SysUserQuery query) {
        return createQuery(query).list();
    }

    public QueryChainWrapper<SysUser> createQuery(SysUserQuery query) {
        QueryChainWrapper<SysUser> wrapper = query();
        if (ObjectUtil.isNotEmpty(query.getEnabled())) {
            wrapper.like("name", query.getName());
        }
        return wrapper;
    }
}

