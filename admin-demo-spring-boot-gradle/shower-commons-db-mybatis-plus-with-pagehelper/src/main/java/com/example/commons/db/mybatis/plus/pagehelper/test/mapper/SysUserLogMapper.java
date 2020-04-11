package com.example.commons.db.mybatis.plus.pagehelper.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.commons.db.mybatis.plus.pagehelper.test.pojo.SysUserLog;
import com.example.commons.db.mybatis.plus.pagehelper.test.pojo.SysUserLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysUserLogMapper extends BaseMapper<SysUserLog> {
    long countByExample(SysUserLogExample example);

    int deleteByExample(SysUserLogExample example);

    List<SysUserLog> selectByExample(SysUserLogExample example);

    int updateByExampleSelective(@Param("record") SysUserLog record, @Param("example") SysUserLogExample example);

    int updateByExample(@Param("record") SysUserLog record, @Param("example") SysUserLogExample example);

    int updateBatch(List<SysUserLog> list);

    int updateBatchSelective(List<SysUserLog> list);

    int batchInsert(@Param("list") List<SysUserLog> list);
}