package com.example.application.customer.controller;

import com.example.application.customer.service.AdminCustomerInfoService;
import com.example.commons.web.controller.BaseController;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 13:43
 */
@RestController
@RequestMapping("customer/info")
@AllArgsConstructor
@Validated
public class AdminCustomerInfoController extends BaseController {
    private AdminCustomerInfoService adminCustomerInfoService;
}