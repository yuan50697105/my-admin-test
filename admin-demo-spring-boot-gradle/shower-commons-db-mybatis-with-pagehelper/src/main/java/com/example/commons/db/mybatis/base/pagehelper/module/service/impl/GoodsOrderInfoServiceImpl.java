package com.example.commons.db.mybatis.base.pagehelper.module.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.commons.db.mybatis.base.pagehelper.module.mapper.GoodsOrderInfoMapper;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.GoodsOrderInfoExample;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.GoodsOrderInfo;
import com.example.commons.db.mybatis.base.pagehelper.module.service.GoodsOrderInfoService;
@Service
public class GoodsOrderInfoServiceImpl implements GoodsOrderInfoService{

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
    public int updateByExampleSelective(GoodsOrderInfo record,GoodsOrderInfoExample example) {
        return goodsOrderInfoMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(GoodsOrderInfo record,GoodsOrderInfoExample example) {
        return goodsOrderInfoMapper.updateByExample(record,example);
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

}
