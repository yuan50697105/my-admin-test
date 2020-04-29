package org.yuan.showercloud.modules.user.service.impl;

import org.springframework.stereotype.Service;
import org.yuan.showercloud.modules.user.service.SysUserService;

/**
 * @program: shower-cloud
 * @description:
 * @author: yuane
 * @create: 2020-04-29 20:32
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Override
    public String getUsername(String username) {
        return username;
    }
}