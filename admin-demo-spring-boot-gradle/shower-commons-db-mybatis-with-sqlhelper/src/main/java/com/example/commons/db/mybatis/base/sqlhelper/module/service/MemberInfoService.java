package com.example.commons.db.mybatis.base.sqlhelper.module.service;

import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.MemberInfoExample;
import java.util.List;
import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.MemberInfo;
public interface MemberInfoService{


    long countByExample(MemberInfoExample example);

    int deleteByExample(MemberInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MemberInfo record);

    int insertSelective(MemberInfo record);

    List<MemberInfo> selectByExample(MemberInfoExample example);

    MemberInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(MemberInfo record,MemberInfoExample example);

    int updateByExample(MemberInfo record,MemberInfoExample example);

    int updateByPrimaryKeySelective(MemberInfo record);

    int updateByPrimaryKey(MemberInfo record);

    int updateBatch(List<MemberInfo> list);

    int updateBatchSelective(List<MemberInfo> list);

    int batchInsert(List<MemberInfo> list);

}
