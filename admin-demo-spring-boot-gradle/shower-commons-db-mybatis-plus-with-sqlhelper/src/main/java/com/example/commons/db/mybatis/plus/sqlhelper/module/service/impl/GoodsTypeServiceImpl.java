package com.example.commons.db.mybatis.plus.sqlhelper.module.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.commons.db.mybatis.plus.sqlhelper.module.mapper.GoodsTypeMapper;
import java.util.List;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.GoodsType;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.GoodsTypeExample;
import com.example.commons.db.mybatis.plus.sqlhelper.module.service.GoodsTypeService;
@Service
public class GoodsTypeServiceImpl extends ServiceImpl<GoodsTypeMapper, GoodsType> implements GoodsTypeService{

    @Override
    public long countByExample(GoodsTypeExample example) {
        return baseMapper.countByExample(example);
    }
    @Override
    public int deleteByExample(GoodsTypeExample example) {
        return baseMapper.deleteByExample(example);
    }
    @Override
    public List<GoodsType> selectByExample(GoodsTypeExample example) {
        return baseMapper.selectByExample(example);
    }
    @Override
    public int updateByExampleSelective(GoodsType record,GoodsTypeExample example) {
        return baseMapper.updateByExampleSelective(record,example);
    }
    @Override
    public int updateByExample(GoodsType record,GoodsTypeExample example) {
        return baseMapper.updateByExample(record,example);
    }
    @Override
    public int updateBatch(List<GoodsType> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<GoodsType> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<GoodsType> list) {
        return baseMapper.batchInsert(list);
    }
}
