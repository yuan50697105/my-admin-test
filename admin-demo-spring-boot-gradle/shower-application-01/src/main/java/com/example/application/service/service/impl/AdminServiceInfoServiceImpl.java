package com.example.application.service.service.impl;

import com.example.application.service.service.AdminServiceInfoService;
import com.example.commons.db.mybatis.base.pagehelper.module.service.impl.ServiceInfoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-12 21:09
 */
@Service
@AllArgsConstructor
public class AdminServiceInfoServiceImpl implements AdminServiceInfoService {
    private final ServiceInfoService serviceInfoService;
}