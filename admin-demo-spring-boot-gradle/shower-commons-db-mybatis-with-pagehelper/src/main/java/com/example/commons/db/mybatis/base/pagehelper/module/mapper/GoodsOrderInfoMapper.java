package com.example.commons.db.mybatis.base.pagehelper.module.mapper;

import com.example.commons.db.mybatis.base.pagehelper.module.pojo.GoodsOrderInfo;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.GoodsOrderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsOrderInfoMapper {
    long countByExample(GoodsOrderInfoExample example);

    int deleteByExample(GoodsOrderInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsOrderInfo record);

    int insertSelective(GoodsOrderInfo record);

    List<GoodsOrderInfo> selectByExample(GoodsOrderInfoExample example);

    GoodsOrderInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsOrderInfo record, @Param("example") GoodsOrderInfoExample example);

    int updateByExample(@Param("record") GoodsOrderInfo record, @Param("example") GoodsOrderInfoExample example);

    int updateByPrimaryKeySelective(GoodsOrderInfo record);

    int updateByPrimaryKey(GoodsOrderInfo record);

    int updateBatch(List<GoodsOrderInfo> list);

    int updateBatchSelective(List<GoodsOrderInfo> list);

    int batchInsert(@Param("list") List<GoodsOrderInfo> list);
}