package com.example.commons.db.mybatis.plus.sqlhelper.module.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.SysUser;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    List<SysUser> selectByExample(SysUserExample example);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateBatch(List<SysUser> list);

    int updateBatchSelective(List<SysUser> list);

    int batchInsert(@Param("list") List<SysUser> list);
}