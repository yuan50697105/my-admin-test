package com.example.commons.db.mybatis.mapper.base.sqlhelper.test.service.impl;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.test.mapper.SysUserLogMapper;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.test.service.SysUserLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserLogServiceImpl implements SysUserLogService {

    @Resource
    private SysUserLogMapper sysUserLogMapper;

}
