package com.example.commons.db.mybatis.plus.sqlhelper.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.SysPermission;
import com.example.commons.db.mybatis.plus.sqlhelper.test.pojo.SysPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysPermissionMapper extends BaseMapper<SysPermission> {
    long countByExample(SysPermissionExample example);

    int deleteByExample(SysPermissionExample example);

    List<SysPermission> selectByExample(SysPermissionExample example);

    int updateByExampleSelective(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    int updateByExample(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    int updateBatch(List<SysPermission> list);

    int updateBatchSelective(List<SysPermission> list);

    int batchInsert(@Param("list") List<SysPermission> list);
}