package com.example.application.customer.service;

import com.example.application.customer.pojo.type.AdminCustomerTypeSaveRequestBody;
import com.example.application.customer.pojo.type.AdminCustomerTypeUpdateRequestBody;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.query.CustomerTypeQuery;
import com.example.commons.web.base.pojo.Result;

import java.util.List;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 21:32
 */
public interface AdminCustomerTypeService {
    Result data(CustomerTypeQuery query);

    Result list(CustomerTypeQuery query);

    Result get(Long id);

    Result save(AdminCustomerTypeSaveRequestBody requestBody);

    Result update(AdminCustomerTypeUpdateRequestBody requestBody);

    Result delete(Long id);

    Result delete(List<Long> ids);
}
