package com.example.commons.db.mybatis.base.sqlhelper.module.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.GoodsOrderItem;
import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.GoodsOrderItemExample;
import com.example.commons.db.mybatis.base.sqlhelper.module.mapper.GoodsOrderItemMapper;
import com.example.commons.db.mybatis.base.sqlhelper.module.service.GoodsOrderItemService;

@Service
public class GoodsOrderItemServiceImpl implements GoodsOrderItemService {

    @Resource
    private GoodsOrderItemMapper goodsOrderItemMapper;

    @Override
    public long countByExample(GoodsOrderItemExample example) {
        return goodsOrderItemMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(GoodsOrderItemExample example) {
        return goodsOrderItemMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return goodsOrderItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GoodsOrderItem record) {
        return goodsOrderItemMapper.insert(record);
    }

    @Override
    public int insertSelective(GoodsOrderItem record) {
        return goodsOrderItemMapper.insertSelective(record);
    }

    @Override
    public List<GoodsOrderItem> selectByExample(GoodsOrderItemExample example) {
        return goodsOrderItemMapper.selectByExample(example);
    }

    @Override
    public GoodsOrderItem selectByPrimaryKey(Long id) {
        return goodsOrderItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(GoodsOrderItem record, GoodsOrderItemExample example) {
        return goodsOrderItemMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(GoodsOrderItem record, GoodsOrderItemExample example) {
        return goodsOrderItemMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsOrderItem record) {
        return goodsOrderItemMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GoodsOrderItem record) {
        return goodsOrderItemMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<GoodsOrderItem> list) {
        return goodsOrderItemMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<GoodsOrderItem> list) {
        return goodsOrderItemMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<GoodsOrderItem> list) {
        return goodsOrderItemMapper.batchInsert(list);
    }

}

