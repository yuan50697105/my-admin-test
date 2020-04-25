package org.yuan.adminbase.modules.service;

import org.yuan.adminbase.commons.entity.ResponseResult;
import org.yuan.adminbase.modules.entity.SysUserQuery;

/**
 * @program: admin-base
 * @description:
 * @author: yuane
 * @create: 2020-04-25 12:46
 */
public interface SysUserService {
    ResponseResult<?> data(SysUserQuery query);

    ResponseResult<?> list(SysUserQuery query);

    ResponseResult<?> get(Long id);
}
