package com.example.commons.db.mybatis.mapper.sqlhelper.test.service.impl;

import com.example.commons.db.mybatis.mapper.sqlhelper.pojo.PageResult;
import com.example.commons.db.mybatis.mapper.sqlhelper.test.mapper.SysRoleMapper;
import com.example.commons.db.mybatis.mapper.sqlhelper.test.pojo.SysRole;
import com.example.commons.db.mybatis.mapper.sqlhelper.test.pojo.SysUser;
import com.example.commons.db.mybatis.mapper.sqlhelper.test.pojo.query.SysRoleQuery;
import com.example.commons.db.mybatis.mapper.sqlhelper.test.service.SysRoleService;
import com.example.commons.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.weekend.Weekend;
import tk.mybatis.mapper.weekend.WeekendSqls;

import javax.annotation.Resource;
import java.util.List;

import static cn.hutool.core.util.ObjectUtil.isNotEmpty;

@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;

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
        WeekendSqls<SysRole> weekendSqls = WeekendSqls.custom();
        weekendSqls.andIn(SysRole::getId, ids);
        Example example = Weekend.builder(SysRole.class).where(weekendSqls).build();
        return sysRoleMapper.deleteByExample(example);
    }

    @Override
    public IPageResult<SysRole> selectPageByQuery(SysRoleQuery query) {
        Example example = createExample(query);
        return selectPageByExample(example, query.getPage(), query.getSize());
    }

    @Override
    public List<SysRole> selectByQuery(SysRoleQuery query) {
        Example example = createExample(query);
        return selectByExample(example);
    }

    @Override
    public List<SysRole> selectByExample(Object object) {
        return sysRoleMapper.selectByExample(object);
    }

    @Override
    public IPageResult<SysRole> selectPageByExample(Object object, int page, int size) {
        PageHelper.startPage(page, size);
        List<SysRole> list = selectByExample(object);
        PageInfo<SysRole> pageInfo = new PageInfo<>(list);
        return new PageResult<>(pageInfo);
    }

    public Example createExample(SysRoleQuery query) {
        Example.Builder builder = Weekend.builder(SysUser.class);
        WeekendSqls<SysRole> weekendSqls = WeekendSqls.custom();
        if (isNotEmpty(query.getName())) {
            weekendSqls.andLike(SysRole::getName, "%" + query.getName() + "%");
        }
        return builder.where(weekendSqls).build();
    }
}
