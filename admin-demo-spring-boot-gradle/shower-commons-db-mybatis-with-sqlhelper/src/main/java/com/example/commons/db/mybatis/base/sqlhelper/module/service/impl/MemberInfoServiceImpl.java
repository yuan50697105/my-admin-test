package com.example.commons.db.mybatis.base.sqlhelper.module.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.MemberInfoExample;
import java.util.List;
import com.example.commons.db.mybatis.base.sqlhelper.module.mapper.MemberInfoMapper;
import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.MemberInfo;
import com.example.commons.db.mybatis.base.sqlhelper.module.service.MemberInfoService;

@Service
public class MemberInfoServiceImpl implements MemberInfoService {

    @Resource
    private MemberInfoMapper memberInfoMapper;

    @Override
    public long countByExample(MemberInfoExample example) {
        return memberInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MemberInfoExample example) {
        return memberInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return memberInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MemberInfo record) {
        return memberInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(MemberInfo record) {
        return memberInfoMapper.insertSelective(record);
    }

    @Override
    public List<MemberInfo> selectByExample(MemberInfoExample example) {
        return memberInfoMapper.selectByExample(example);
    }

    @Override
    public MemberInfo selectByPrimaryKey(Long id) {
        return memberInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(MemberInfo record, MemberInfoExample example) {
        return memberInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(MemberInfo record, MemberInfoExample example) {
        return memberInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(MemberInfo record) {
        return memberInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MemberInfo record) {
        return memberInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<MemberInfo> list) {
        return memberInfoMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<MemberInfo> list) {
        return memberInfoMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<MemberInfo> list) {
        return memberInfoMapper.batchInsert(list);
    }

}

