package org.yuan.adminbase.modules.controller;

import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.adminbase.commons.controller.BaseController;
import org.yuan.adminbase.commons.entity.ResponseResult;
import org.yuan.adminbase.modules.entity.SysUserQuery;
import org.yuan.adminbase.modules.service.SysUserService;

/**
 * @program: admin-base
 * @description:
 * @author: yuane
 * @create: 2020-04-25 12:46
 */
@RestController
@RequestMapping("sys/user")
@AllArgsConstructor
@Validated
public class SysUserController extends BaseController {
    private final SysUserService sysUserService;

    @GetMapping("data")
    public ResponseResult<?> data(SysUserQuery query) {
        return sysUserService.data(query);
    }

    @GetMapping("list")
    public ResponseResult<?> list(SysUserQuery query) {
        return sysUserService.list(query);
    }

    @GetMapping("get")
    public ResponseResult<?> get(Long id) {
        return sysUserService.get(id);
    }


}