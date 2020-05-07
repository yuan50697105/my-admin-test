package com.example.application.test;

import ai.yue.library.base.view.Result;
import com.example.application.admin.service.AdminSysPermissionService;
import com.example.commons.db.mybatis.base.pagehelper.module.service.SysPermissionService;
import com.example.commons.web.base.controller.BaseController;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: admin-demo-spring-boot-maven
 * @description:
 * @author: yuane
 * @create: 2020-05-07 22:01
 */
@RestController
@RequestMapping
@Validated
public class TestController extends BaseController {

    private TestService testService;

    public Result<?> aaa(){
        return testService.add();
    }
}