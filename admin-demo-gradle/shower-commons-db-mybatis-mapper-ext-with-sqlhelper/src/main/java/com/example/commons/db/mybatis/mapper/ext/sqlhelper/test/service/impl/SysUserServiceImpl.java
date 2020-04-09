package com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.mapper.SysUserMapper;
import java.util.List;
import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.pojo.SysUser;
import com.example.commons.db.mybatis.mapper.ext.sqlhelper.test.service.SysUserService;
@Service
public class SysUserServiceImpl implements SysUserService{

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public int updateBatch(List<SysUser> list) {
        return sysUserMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysUser> list) {
        return sysUserMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysUser> list) {
        return sysUserMapper.batchInsert(list);
    }

}
