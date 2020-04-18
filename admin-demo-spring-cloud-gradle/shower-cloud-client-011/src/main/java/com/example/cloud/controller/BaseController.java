package com.example.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: admin-demo-spring-cloud-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-18 12:45
 */
@RestController
@RequestMapping("base")
public class BaseController {
    @RequestMapping("test")
    public String test() {
        return "test01";
    }
}