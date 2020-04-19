package com.example.commons.db.mybatis.base.pagehelper.module.service.impl;

import com.example.commons.db.mybatis.base.pagehelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.base.pagehelper.module.mapper.GoodsOrderInfoMapper;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.GoodsOrderInfo;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.GoodsOrderInfoExample;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.query.GoodsOrderInfoQuery;
import com.example.commons.db.mybatis.base.pagehelper.module.service.GoodsOrderInfoService;
import com.example.commons.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsOrderInfoServiceImpl implements GoodsOrderInfoService {

    @Resource
    private GoodsOrderInfoMapper goodsOrderInfoMapper;

    @Override
    public long countByExample(GoodsOrderInfoExample example) {
        return goodsOrderInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(GoodsOrderInfoExample example) {
        return goodsOrderInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return goodsOrderInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GoodsOrderInfo record) {
        return goodsOrderInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(GoodsOrderInfo record) {
        return goodsOrderInfoMapper.insertSelective(record);
    }

    @Override
    public List<GoodsOrderInfo> selectByExample(GoodsOrderInfoExample example) {
        return goodsOrderInfoMapper.selectByExample(example);
    }

    @Override
    public GoodsOrderInfo selectByPrimaryKey(Long id) {
        return goodsOrderInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(GoodsOrderInfo record, GoodsOrderInfoExample example) {
        return goodsOrderInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(GoodsOrderInfo record, GoodsOrderInfoExample example) {
        return goodsOrderInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsOrderInfo record) {
        return goodsOrderInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GoodsOrderInfo record) {
        return goodsOrderInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<GoodsOrderInfo> list) {
        return goodsOrderInfoMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<GoodsOrderInfo> list) {
        return goodsOrderInfoMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<GoodsOrderInfo> list) {
        return goodsOrderInfoMapper.batchInsert(list);
    }

    @Override
    public IPageResult<GoodsOrderInfo> selectPageByQuery(GoodsOrderInfoQuery query) {
        PageHelper.startPage(query.getPage(), query.getSize());
        return new PageResult<>(new PageInfo<>(selectByExample(query.toExample())));
    }

    @Override
    public List<GoodsOrderInfo> selectByQuery(GoodsOrderInfoQuery query) {
        return selectByExample(query.toExample());
    }

    @Override
    public List<GoodsOrderInfo> selectByPrimaryKeys(List<Long> ids) {
        GoodsOrderInfoExample example = new GoodsOrderInfoExample();
        example.or().andIdIn(ids);
        return selectByExample(example);
    }

}

