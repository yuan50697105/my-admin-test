package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service.impl;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.mapper.SysUserMapper;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.SysUser;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.query.SysUserQuery;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service.SysUserService;
import com.example.db.pojo.IPageResult;
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

    @Override
    public int updateBatch(List<SysUser> list) {
        return sysUserMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysUser> list) {
        return sysUserMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysUser> list) {
        return sysUserMapper.batchInsert(list);
    }

    @Override
    public boolean existByUsername(String username) {
        Example example = new Example(SysUser.class);
        example.and().andEqualTo("username", username);
        return sysUserMapper.selectCountByExample(example) > 0;
    }
}



