package com.example.commons.db.mybatis.mapper.base.pagehelper.module.mapper;

import com.example.commons.db.mybatis.mapper.base.pagehelper.module.pojo.SysUser;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysUserMapper extends tk.mybatis.mapper.common.Mapper<SysUser> {
    int updateBatch(List<SysUser> list);

    int updateBatchSelective(List<SysUser> list);

    int batchInsert(@Param("list") List<SysUser> list);
}