package com.example.commons.db.mybatis.mapper.pagehelper.test.service.impl;

import com.example.commons.db.mybatis.mapper.pagehelper.test.mapper.SysPermissionMapper;
import com.example.commons.db.mybatis.mapper.pagehelper.test.service.SysPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class SysPermissionServiceImpl implements SysPermissionService{

    @Resource
    private SysPermissionMapper sysPermissionMapper;

}
