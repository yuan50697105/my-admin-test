package com.example.commons.db.mybatis.mapper.pagehelper.test.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.commons.db.mybatis.mapper.pagehelper.test.mapper.SysUserLogMapper;
import com.example.commons.db.mybatis.mapper.pagehelper.test.service.SysUserLogService;
@Service
public class SysUserLogServiceImpl implements SysUserLogService{

    @Resource
    private SysUserLogMapper sysUserLogMapper;

}