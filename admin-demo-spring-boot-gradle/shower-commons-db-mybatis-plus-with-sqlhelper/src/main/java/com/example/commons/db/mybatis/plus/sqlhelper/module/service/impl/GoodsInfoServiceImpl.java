package com.example.commons.db.mybatis.plus.sqlhelper.module.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.example.commons.db.mybatis.plus.sqlhelper.module.mapper.GoodsInfoMapper;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.GoodsInfo;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.GoodsInfoExample;
import com.example.commons.db.mybatis.plus.sqlhelper.module.service.GoodsInfoService;
@Service
public class GoodsInfoServiceImpl extends ServiceImpl<GoodsInfoMapper, GoodsInfo> implements GoodsInfoService{

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
    public int updateByExampleSelective(GoodsInfo record,GoodsInfoExample example) {
        return baseMapper.updateByExampleSelective(record,example);
    }
    @Override
    public int updateByExample(GoodsInfo record,GoodsInfoExample example) {
        return baseMapper.updateByExample(record,example);
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
}
