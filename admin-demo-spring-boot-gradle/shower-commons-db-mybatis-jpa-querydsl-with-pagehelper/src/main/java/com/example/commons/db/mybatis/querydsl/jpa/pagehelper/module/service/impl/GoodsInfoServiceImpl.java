package com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.service.impl;

import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.mapper.GoodsInfoMapper;
import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.pojo.GoodsInfo;
import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.pojo.GoodsInfoExample;
import com.example.commons.db.mybatis.querydsl.jpa.pagehelper.module.service.GoodsInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {

    @Resource
    private GoodsInfoMapper goodsInfoMapper;

    @Override
    public long countByExample(GoodsInfoExample example) {
        return goodsInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(GoodsInfoExample example) {
        return goodsInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return goodsInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GoodsInfo record) {
        return goodsInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(GoodsInfo record) {
        return goodsInfoMapper.insertSelective(record);
    }

    @Override
    public List<GoodsInfo> selectByExample(GoodsInfoExample example) {
        return goodsInfoMapper.selectByExample(example);
    }

    @Override
    public GoodsInfo selectByPrimaryKey(Long id) {
        return goodsInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(GoodsInfo record, GoodsInfoExample example) {
        return goodsInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(GoodsInfo record, GoodsInfoExample example) {
        return goodsInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsInfo record) {
        return goodsInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GoodsInfo record) {
        return goodsInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<GoodsInfo> list) {
        return goodsInfoMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<GoodsInfo> list) {
        return goodsInfoMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<GoodsInfo> list) {
        return goodsInfoMapper.batchInsert(list);
    }

}


