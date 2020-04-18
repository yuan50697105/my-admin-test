package com.example.commons.db.mybatis.jpa.base.pagehelper.module.service.impl;

import com.example.commons.db.mybatis.jpa.base.pagehelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.mapper.GoodsTypeMapper;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.GoodsType;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.GoodsTypeExample;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.query.GoodsTypeQuery;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.repository.GoodsTypeRepository;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.service.GoodsTypeService;
import com.example.commons.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService{
    @Resource
    private GoodsTypeRepository goodsTypeRepository;
    @Resource
    private GoodsTypeMapper goodsTypeMapper;

    @Override
    public long countByExample(GoodsTypeExample example) {
        return goodsTypeMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(GoodsTypeExample example) {
        return goodsTypeMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return goodsTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GoodsType record) {
        return goodsTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(GoodsType record) {
        return goodsTypeMapper.insertSelective(record);
    }

    @Override
    public List<GoodsType> selectByExample(GoodsTypeExample example) {
        return goodsTypeMapper.selectByExample(example);
    }

    @Override
    public GoodsType selectByPrimaryKey(Long id) {
        return goodsTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(GoodsType record,GoodsTypeExample example) {
        return goodsTypeMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(GoodsType record,GoodsTypeExample example) {
        return goodsTypeMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsType record) {
        return goodsTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GoodsType record) {
        return goodsTypeMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<GoodsType> list) {
        return goodsTypeMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<GoodsType> list) {
        return goodsTypeMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<GoodsType> list) {
        return goodsTypeMapper.batchInsert(list);
    }

    @Override
    public IPageResult<GoodsType> selectPageByQuery(GoodsTypeQuery query) {
        PageHelper.startPage(query.getPage(), query.getSize());
        return new PageResult<>(new PageInfo<>(selectByExample(query.toExample())));
    }

    @Override
    public List<GoodsType> selectByQuery(GoodsTypeQuery query) {
        return selectByExample(query.toExample());
    }

    @Override
    public int deleteByPrimaryKeys(List<Long> ids) {
        GoodsTypeExample example = new GoodsTypeExample();
        example.or().andIdIn(ids);
        return deleteByExample(example);
    }

}
