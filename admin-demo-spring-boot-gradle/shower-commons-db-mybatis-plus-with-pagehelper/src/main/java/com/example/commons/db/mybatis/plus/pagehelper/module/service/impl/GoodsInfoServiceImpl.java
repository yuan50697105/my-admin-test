package com.example.commons.db.mybatis.plus.pagehelper.module.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.commons.db.mybatis.plus.pagehelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.plus.pagehelper.module.mapper.GoodsInfoMapper;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.GoodsInfo;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.GoodsInfoExample;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.query.GoodsInfoQuery;
import com.example.commons.db.mybatis.plus.pagehelper.module.service.GoodsInfoService;
import com.example.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsInfoServiceImpl extends ServiceImpl<GoodsInfoMapper, GoodsInfo> implements GoodsInfoService {

    @Override
    public long countByExample(GoodsInfoExample example) {
        return baseMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(GoodsInfoExample example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public List<GoodsInfo> selectByExample(GoodsInfoExample example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(GoodsInfo record, GoodsInfoExample example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(GoodsInfo record, GoodsInfoExample example) {
        return baseMapper.updateByExample(record, example);
    }

    @Override
    public int updateBatch(List<GoodsInfo> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<GoodsInfo> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<GoodsInfo> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public IPageResult<GoodsInfo> selectPageByQuery(GoodsInfoQuery query) {
        PageHelper.startPage(query.getPage(), query.getSize());
        return new PageResult<>(new PageInfo<>(baseMapper.selectByExample(query.toExample())));
    }

    @Override
    public List<GoodsInfo> selectByQuery(GoodsInfoQuery query) {
        return baseMapper.selectByExample(query.toExample());
    }
}
