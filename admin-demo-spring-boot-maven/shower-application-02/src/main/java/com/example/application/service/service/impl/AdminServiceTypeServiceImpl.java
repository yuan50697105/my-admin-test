package com.example.application.service.service.impl;

import com.example.application.service.service.AdminServiceTypeService;
import com.example.commons.db.mybatis.base.sqlhelper.module.service.ServiceTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-12 21:21
 */
@Service
@AllArgsConstructor
public class AdminServiceTypeServiceImpl implements AdminServiceTypeService {
    private final ServiceTypeService serviceTypeService;
}