package com.example.commons.db.mybatis.plus.sqlhelper.test.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.SysUserLog;
import com.example.commons.db.mybatis.plus.sqlhelper.test.mapper.SysUserLogMapper;
import com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.SysUserLogExample;
import com.example.commons.db.mybatis.plus.sqlhelper.test.service.SysUserLogService;
@Service
public class SysUserLogServiceImpl extends ServiceImpl<SysUserLogMapper, SysUserLog> implements SysUserLogService{

    @Override
    public long countByExample(SysUserLogExample example) {
        return baseMapper.countByExample(example);
    }
    @Override
    public int deleteByExample(SysUserLogExample example) {
        return baseMapper.deleteByExample(example);
    }
    @Override
    public List<SysUserLog> selectByExample(SysUserLogExample example) {
        return baseMapper.selectByExample(example);
    }
    @Override
    public int updateByExampleSelective(SysUserLog record,SysUserLogExample example) {
        return baseMapper.updateByExampleSelective(record,example);
    }
    @Override
    public int updateByExample(SysUserLog record,SysUserLogExample example) {
        return baseMapper.updateByExample(record,example);
    }
    @Override
    public int updateBatch(List<SysUserLog> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<SysUserLog> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<SysUserLog> list) {
        return baseMapper.batchInsert(list);
    }
}