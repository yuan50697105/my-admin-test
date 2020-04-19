package com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.service.impl;

import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.mapper.GoodsInfoMapper;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.pojo.GoodsInfo;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.pojo.GoodsInfoExample;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.pojo.query.GoodsInfoQuery;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.repository.GoodsInfoRepository;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.service.GoodsInfoService;
import com.example.commons.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {
    @Resource
    private GoodsInfoRepository goodsInfoRepository;
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
    public int updateByExampleSelective(GoodsInfo record,GoodsInfoExample example) {
        return goodsInfoMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(GoodsInfo record,GoodsInfoExample example) {
        return goodsInfoMapper.updateByExample(record,example);
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

    @Override
    public IPageResult<GoodsInfo> selectPageByQuery(GoodsInfoQuery query) {
        PageHelper.startPage(query.getPage(), query.getSize());
        return new PageResult<>(new PageInfo<>(selectByExample(query.toExample())));
    }

    @Override
    public List<GoodsInfo> selectByQuery(GoodsInfoQuery query) {
        return selectByExample(query.toExample());
    }

    @Override
    public int deleteByPrimaryKeys(List<Long> ids) {
        GoodsInfoExample example = new GoodsInfoExample();
        example.or().andIdIn(ids);
        return deleteByExample(example);
    }

}
