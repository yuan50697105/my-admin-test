package com.example.commons.db.mybatis.mapper.base.sqlhelper.test.service.impl;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.test.mapper.SysPermissionMapper;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.test.service.SysPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysPermissionServiceImpl implements SysPermissionService {

    @Resource
    private SysPermissionMapper sysPermissionMapper;

}
