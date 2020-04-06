package com.example.commons.db.mybatis.mapper.pagehelper.test.service.impl;

import com.example.commons.db.mybatis.mapper.pagehelper.pojo.PageResult;
import com.example.commons.db.mybatis.mapper.pagehelper.test.mapper.SysUserMapper;
import com.example.commons.db.mybatis.mapper.pagehelper.test.pojo.SysUser;
import com.example.commons.db.mybatis.mapper.pagehelper.test.pojo.query.SysUserQuery;
import com.example.commons.db.mybatis.mapper.pagehelper.test.service.SysUserService;
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
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public int insert(SysUser sysUser) {
        return sysUserMapper.insert(sysUser);
    }

    @Override
    public SysUser selectByPrimaryKey(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser sysUser) {
        return sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(List<Long> ids) {
        Example example = Weekend.builder(SysUser.class).where(WeekendSqls.<SysUser>custom().andIn(SysUser::getId, ids)).build();
        return sysUserMapper.deleteByExample(example);
    }

    @Override
    public IPageResult<SysUser> selectPageByQuery(SysUserQuery query) {
        Example example = createExample(query);
        return selectPageByExample(example, query.getPage(), query.getSize());
    }

    @Override
    public List<SysUser> selectByQuery(SysUserQuery query) {
        Example example = createExample(query);
        return selectByExample(example);
    }

    @Override
    public List<SysUser> selectByExample(Object object) {
        return sysUserMapper.selectByExample(object);
    }

    @Override
    public IPageResult<SysUser> selectPageByExample(Object object, int page, int size) {
        PageHelper.startPage(page, size);
        List<SysUser> list = selectByExample(object);
        PageInfo<SysUser> pageInfo = new PageInfo<>(list);
        return new PageResult<>(pageInfo);
    }

    public Example createExample(SysUserQuery query) {
        Example.Builder builder = Weekend.builder(SysUser.class);
        WeekendSqls<SysUser> weekendSqls = WeekendSqls.custom();
        if (isNotEmpty(query.getUsername())) {
            weekendSqls.andLike(SysUser::getUsername, "%" + query.getUsername() + "%");
        }
        return builder.where(weekendSqls).build();
    }
}
