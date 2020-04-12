package com.example.commons.db.mybatis.base.sqlhelper.module.mapper;

import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.GoodsInfo;
import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.GoodsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsInfoMapper {
    long countByExample(GoodsInfoExample example);

    int deleteByExample(GoodsInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsInfo record);

    int insertSelective(GoodsInfo record);

    List<GoodsInfo> selectByExample(GoodsInfoExample example);

    GoodsInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsInfo record, @Param("example") GoodsInfoExample example);

    int updateByExample(@Param("record") GoodsInfo record, @Param("example") GoodsInfoExample example);

    int updateByPrimaryKeySelective(GoodsInfo record);

    int updateByPrimaryKey(GoodsInfo record);

    int updateBatch(List<GoodsInfo> list);

    int updateBatchSelective(List<GoodsInfo> list);

    int batchInsert(@Param("list") List<GoodsInfo> list);
}