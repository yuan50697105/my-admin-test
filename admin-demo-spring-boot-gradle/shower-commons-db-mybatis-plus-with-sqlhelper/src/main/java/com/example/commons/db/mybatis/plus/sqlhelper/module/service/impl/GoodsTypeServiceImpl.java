package com.example.commons.db.mybatis.plus.sqlhelper.module.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.commons.db.mybatis.plus.sqlhelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.plus.sqlhelper.module.mapper.GoodsTypeMapper;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.GoodsType;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.GoodsTypeExample;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.query.GoodsTypeQuery;
import com.example.commons.db.mybatis.plus.sqlhelper.module.service.GoodsTypeService;
import com.example.commons.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsTypeServiceImpl extends ServiceImpl<GoodsTypeMapper, GoodsType> implements GoodsTypeService {

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

    @Override
    public IPageResult<GoodsType> selectPageByQuery(GoodsTypeQuery query) {
        PageHelper.startPage(query.getPage(), query.getSize());
        return new PageResult<>(new PageInfo<>(baseMapper.selectByExample(query.toExample())));
    }

    @Override
    public List<GoodsType> selectByQuery(GoodsTypeQuery query) {
        return baseMapper.selectByExample(query.toExample());
    }
}
