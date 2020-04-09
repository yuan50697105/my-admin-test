package com.example.application.service.impl;

import com.example.application.pojo.admin.user.AdminSysUserSaveRequestBody;
import com.example.application.pojo.admin.user.AdminSysUserUpdateRequestBody;
import com.example.application.service.AdminSysUserService;
import com.example.commons.db.mybatis.mapper.sqlhelper.test.pojo.SysUser;
import com.example.commons.db.mybatis.mapper.sqlhelper.commons.pojo.query.SysUserQuery;
import com.example.commons.db.mybatis.mapper.sqlhelper.test.service.SysUserService;
import com.example.commons.db.pojo.IPageResult;
import com.example.commons.web.pojo.Result;
import com.example.commons.web.utils.ResultUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static cn.hutool.core.util.ObjectUtil.isNotEmpty;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 13:46
 */
@Service
@AllArgsConstructor
public class AdminSysUserServiceImpl extends BaseServiceImpl implements AdminSysUserService {
    private SysUserService sysUserService;

    /**
     * 保存用户
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    @Override
    @Transactional
    public Result save(AdminSysUserSaveRequestBody requestBody) {
        SysUser sysUser = createUserFromRequestBody(requestBody);
        sysUserService.insert(sysUser);
        return ResultUtils.ok(SAVE_SUCCESS);
    }

    /**
     * 更新用户信息
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    @Override
    @Transactional
    public Result updateInfo(AdminSysUserUpdateRequestBody requestBody) {
        SysUser sysUser = sysUserService.selectByPrimaryKey(requestBody.getId());
        if (isNotEmpty(sysUser)) {
            updateUserInfoFromRequestBody(sysUser, requestBody);
            sysUserService.updateByPrimaryKeySelective(sysUser);
        }
        return ResultUtils.ok(UPDATE_SUCCESS);
    }

    /**
     * 主键查询
     *
     * @param id 主键
     * @return 用户信息
     */
    @Override
    public Result get(Long id) {
        SysUser sysUser = sysUserService.selectByPrimaryKey(id);
        return ResultUtils.data("user", Optional.ofNullable(sysUser).orElse(new SysUser()));
    }

    /**
     * 删除用户
     *
     * @param id 主键
     * @return 处理结果
     */
    @Override
    @Transactional
    public Result delete(Long id) {
        sysUserService.deleteByPrimaryKey(id);
        return ResultUtils.ok(DELELE_SUCCESS);
    }

    @Override
    @Transactional
    public Result delete(List<Long> ids) {
        sysUserService.deleteByIds(ids);
        return ResultUtils.ok(DELELE_SUCCESS);
    }

    /**
     * 分页表格数据
     *
     * @param query 查询条件封装
     * @return 分页结果
     */
    @Override
    public Result data(SysUserQuery query) {
        IPageResult<SysUser> pageResult = sysUserService.selectPageByQuery(query);
        return ResultUtils.data(pageResult);
    }

    /**
     * 列表查询
     *
     * @param query 查询条件
     * @return 数据列表
     */
    @Override
    public Result list(SysUserQuery query) {
        List<SysUser> list = sysUserService.selectByQuery(query);
        return ResultUtils.data("data", list);
    }

    /**
     * 创建保存实体
     *
     * @param requestBody 请求实体
     * @return 用户实体
     */
    private SysUser createUserFromRequestBody(AdminSysUserSaveRequestBody requestBody) {
        SysUser sysUser = new SysUser();
        sysUser.setUsername(requestBody.getUsername());
        sysUser.setName(requestBody.getName());
        sysUser.setPassword(requestBody.getPassword());
        return sysUser;
    }

    /**
     * 更新用户信息
     *
     * @param sysUser     数据库原始数据
     * @param requestBody 请求实体
     */
    private void updateUserInfoFromRequestBody(SysUser sysUser, AdminSysUserUpdateRequestBody requestBody) {
        sysUser.copyFrom(requestBody);
    }
}