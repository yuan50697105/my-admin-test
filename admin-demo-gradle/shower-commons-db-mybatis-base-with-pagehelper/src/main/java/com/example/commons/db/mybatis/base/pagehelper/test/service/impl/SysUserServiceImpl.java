package com.example.commons.db.mybatis.base.pagehelper.test.service.impl;

import com.example.commons.db.mybatis.base.pagehelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.base.pagehelper.test.mapper.SysUserMapper;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.SysUser;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.SysUserExample;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.query.SysUserQuery;
import com.example.commons.db.mybatis.base.pagehelper.test.service.SysUserService;
import com.example.commons.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static cn.hutool.core.util.ObjectUtil.isNotEmpty;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public long countByExample(SysUserExample example) {
        return sysUserMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SysUserExample example) {
        return sysUserMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(List<Long> ids) {
        SysUserExample example = new SysUserExample();
        example.or().andIdIn(ids);
        return deleteByExample(example);
    }

    @Override
    public int insert(SysUser record) {
        return sysUserMapper.insert(record);
    }

    @Override
    public int insertSelective(SysUser record) {
        return sysUserMapper.insertSelective(record);
    }

    @Override
    public List<SysUser> selectByExample(SysUserExample example) {
        return sysUserMapper.selectByExample(example);
    }

    @Override
    public SysUser selectByPrimaryKey(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(SysUser record, SysUserExample example) {
        return sysUserMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(SysUser record, SysUserExample example) {
        return sysUserMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser record) {
        return sysUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysUser record) {
        return sysUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public IPageResult<SysUser> selectPageByQuery(SysUserQuery query) {
        SysUserExample example = createExample(query);
        return selectPageByExample(example, query.getPage(), query.getSize());
    }

    @Override
    public IPageResult<SysUser> selectPageByExample(SysUserExample example, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageResult<>(new PageInfo<>(selectByExample(example)));
    }

    @Override
    public List<SysUser> selectByQuery(SysUserQuery query) {
        SysUserExample example = createExample(query);
        return selectByExample(example);
    }


    /**
     * 创建查询条件
     *
     * @param query 实体
     * @return 查询条件
     */
    public SysUserExample createExample(SysUserQuery query) {
        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        if (isNotEmpty(query.getUsername())) {
            criteria.andUsernameLike("%" + query.getUsername() + "%");
        }
        if (isNotEmpty(query.getName())) {
            criteria.andNameLike("%" + query.getEnabled() + "%");
        }
        example.or(criteria);
        return example;
    }
}

