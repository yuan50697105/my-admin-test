package com.example.commons.db.es.test;

import com.example.commons.db.es.repository.BaseEsRespository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserRepo extends BaseEsRespository<SysUser, Long> {
    List<SysUser> findAllByContentLike(String content);

}