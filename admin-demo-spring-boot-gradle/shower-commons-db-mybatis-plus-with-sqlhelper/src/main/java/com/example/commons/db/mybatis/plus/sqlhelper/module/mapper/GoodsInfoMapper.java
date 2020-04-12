package com.example.commons.db.mybatis.plus.sqlhelper.module.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.GoodsInfo;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.GoodsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsInfoMapper extends BaseMapper<GoodsInfo> {
    long countByExample(GoodsInfoExample example);

    int deleteByExample(GoodsInfoExample example);

    List<GoodsInfo> selectByExample(GoodsInfoExample example);

    int updateByExampleSelective(@Param("record") GoodsInfo record, @Param("example") GoodsInfoExample example);

    int updateByExample(@Param("record") GoodsInfo record, @Param("example") GoodsInfoExample example);

    int updateBatch(List<GoodsInfo> list);

    int updateBatchSelective(List<GoodsInfo> list);

    int batchInsert(@Param("list") List<GoodsInfo> list);
}