package com.example.application.customer.service;

import com.example.application.customer.pojo.info.AdminCustomerInfoSaveRequestBody;
import com.example.application.customer.pojo.info.AdminCustomerInfoUpdateRequestBody;
import com.example.commons.db.mybatis.querydsl.jpa.sqlhelper.module.pojo.query.CustomerInfoQuery;
import com.example.commons.web.base.pojo.Result;

import java.util.List;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 13:46
 */
public interface AdminCustomerInfoService {
    Result data(CustomerInfoQuery query);

    Result list(CustomerInfoQuery query);

    Result get(Long id);

    Result save(AdminCustomerInfoSaveRequestBody requestBody);

    Result update(AdminCustomerInfoUpdateRequestBody requestBody);

    Result delete(Long id);

    Result delete(List<Long> ids);
}