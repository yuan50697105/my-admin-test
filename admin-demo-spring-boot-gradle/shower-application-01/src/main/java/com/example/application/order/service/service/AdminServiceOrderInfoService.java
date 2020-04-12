package com.example.application.order.service.service;

import com.example.application.order.service.pojo.AdminServiceOrderInfoSaveRequestBody;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.query.ServiceOrderInfoQuery;
import com.example.commons.web.base.pojo.Result;

import java.util.List;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-12 21:13
 */
public interface AdminServiceOrderInfoService {
    Result data(ServiceOrderInfoQuery query);

    Result list(ServiceOrderInfoQuery query);

    Result get(Long id);

    Result get(List<Long> ids);

    Result save(AdminServiceOrderInfoSaveRequestBody requestBody);
}