package org.yuan.showercloud.modules.user.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @program: shower-cloud
 * @description:
 * @author: yuane
 * @create: 2020-04-25 21:29
 */
@FeignClient(value = "user-service", fallback = SysUserService.class)
public interface SysUserService {
}