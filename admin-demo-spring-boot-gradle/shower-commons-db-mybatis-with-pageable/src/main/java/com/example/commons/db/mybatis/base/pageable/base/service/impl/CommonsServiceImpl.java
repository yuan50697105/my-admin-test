package com.example.commons.db.mybatis.base.pageable.base.service.impl;

import com.example.commons.db.mybatis.base.pageable.base.service.ICommonsService;
import com.gitee.hengboy.mybatis.pageable.LogicFunction;
import com.gitee.hengboy.mybatis.pageable.request.PageableRequest;

import java.io.Serializable;

public class CommonsServiceImpl<T,ID extends Serializable> implements ICommonsService<T, ID> {
    void pageTest(){
        PageableRequest.of(1, 1).request(new LogicFunction() {
            @Override
            public void invoke() {

            }
        });
    }
}
