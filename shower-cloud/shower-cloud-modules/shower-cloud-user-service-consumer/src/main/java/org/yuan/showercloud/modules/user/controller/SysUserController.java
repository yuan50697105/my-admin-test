package org.yuan.showercloud.modules.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.showercloud.modules.user.service.impl.SysUserService;

/**
 * @program: shower-cloud
 * @description:
 * @author: yuane
 * @create: 2020-04-29 20:30
 */
@RestController
@RequestMapping
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @GetMapping("get/username/{username}")
    public String getUsername(@PathVariable("username") String username){
        return sysUserService.getUsername(username);
    }
}