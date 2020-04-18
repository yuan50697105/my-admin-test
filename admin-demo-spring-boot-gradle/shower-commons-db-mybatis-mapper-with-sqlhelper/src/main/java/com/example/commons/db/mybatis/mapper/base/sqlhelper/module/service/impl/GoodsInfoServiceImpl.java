package com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service.impl;

import com.example.commons.db.mybatis.mapper.base.sqlhelper.base.pojo.PageResult;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.mapper.GoodsInfoMapper;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.GoodsInfo;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.pojo.query.GoodsInfoQuery;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.module.service.GoodsInfoService;
import com.example.commons.db.pojo.IPageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {

    @Resource
    private GoodsInfoMapper goodsInfoMapper;

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
        return new PageResult<>(new PageInfo<>(goodsInfoMapper.selectByExample(query.toExample())));
    }

    @Override
    public List<GoodsInfo> selectByQuery(GoodsInfoQuery query) {
        return goodsInfoMapper.selectByExample(query.toExample());
    }

    @Override
    public GoodsInfo selectById(Long id) {
        return goodsInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(GoodsInfo goodsInfo) {
        return goodsInfoMapper.insert(goodsInfo);
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsInfo goodsInfo) {
        return goodsInfoMapper.updateByPrimaryKeySelective(goodsInfo);
    }

    @Override
    public int deleteById(Long id) {
        return goodsInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(List<Long> ids) {
        Example.Builder builder = Example.builder(GoodsInfo.class);
        builder.where(Sqls.custom().andIn("id", ids));
        return goodsInfoMapper.deleteByExample(builder.build());
    }

}
