package com.example.application.order.service.controller;

import com.example.application.order.service.service.AdminServiceOrderInfoService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-12 21:13
 */
@RestController
@RequestMapping("order/service/info")
@AllArgsConstructor
@Validated
public class AdminServiceOrderInfoController {
    private AdminServiceOrderInfoService adminServiceOrderInfoService;
}