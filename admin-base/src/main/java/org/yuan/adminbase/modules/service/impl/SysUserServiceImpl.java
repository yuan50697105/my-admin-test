package org.yuan.adminbase.modules.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yuan.adminbase.commons.entity.ResponseResult;
import org.yuan.adminbase.commons.utils.ResponseResultUtils;
import org.yuan.adminbase.modules.entity.SysUser;
import org.yuan.adminbase.modules.entity.SysUserQuery;
import org.yuan.adminbase.modules.mapper.SysUserMapper;
import org.yuan.adminbase.modules.service.SysUserService;

import java.util.List;

/**
 * @program: admin-base
 * @description:
 * @author: yuane
 * @create: 2020-04-25 12:47
 */
@Service
@AllArgsConstructor
public class SysUserServiceImpl implements SysUserService {
    public static final String SELECT_SUCCESS_MESSAGE = "查询成功";
    private final SysUserMapper sysUserMapper;

    @Override
    public ResponseResult<?> data(SysUserQuery query) {
        PageHelper.startPage(query.getPage(), query.getSize());
        List<SysUser> list = sysUserMapper.selectByExample(query.toExample());
        PageInfo<SysUser> pageInfo = new PageInfo<>(list);
        return ResponseResultUtils.ok(SELECT_SUCCESS_MESSAGE, pageInfo);
    }

    @Override
    public ResponseResult<?> list(SysUserQuery query) {
        List<SysUser> list = sysUserMapper.selectByExample(query.toExample());
        return ResponseResultUtils.ok(SELECT_SUCCESS_MESSAGE, "list", list);
    }

    @Override
    public ResponseResult<?> get(Long id) {
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(id);
        return ResponseResultUtils.ok(SELECT_SUCCESS_MESSAGE, "user", sysUser);
    }
}