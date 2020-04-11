package com.example.application.service.customer.impl;

import com.example.application.service.customer.AdminCustomerInfoService;
import com.example.commons.db.mybatis.base.pagehelper.test.service.CustomerInfoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 13:46
 */
@Service
@AllArgsConstructor
public class AdminCustomerInfoServiceImpl implements AdminCustomerInfoService {
    private CustomerInfoService customerInfoService;
}