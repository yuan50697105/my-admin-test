package org.yuan.showercloud.modules.user.service.impl;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: shower-cloud
 * @description:
 * @author: yuane
 * @create: 2020-04-25 21:29
 */
@Component
@FeignClient(value = "user-service-provider")
public interface SysUserService {
    @GetMapping("get/username/{username}")
    String getUsername(@PathVariable("username") String username);
}

