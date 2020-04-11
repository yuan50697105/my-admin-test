package com.example.application.customer.service.impl;

import com.example.application.customer.pojo.type.AdminCustomerTypeSaveRequestBody;
import com.example.application.customer.pojo.type.AdminCustomerTypeUpdateRequestBody;
import com.example.application.customer.service.AdminCustomerTypeService;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.CustomerType;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.query.CustomerTypeQuery;
import com.example.commons.db.mybatis.base.pagehelper.test.service.CustomerTypeService;
import com.example.commons.web.pojo.Result;
import com.example.commons.web.utils.ResultUtils;
import com.example.db.pojo.IPageResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 21:32
 */
@Service
@AllArgsConstructor
public class AdminCustomerTypeServiceImpl implements AdminCustomerTypeService {
    private CustomerTypeService customerTypeService;

    @Override
    public Result data(CustomerTypeQuery query) {
        IPageResult<CustomerType> pageResult = customerTypeService.selectPageByQuery(query);
        return ResultUtils.data(pageResult);
    }

    @Override
    public Result list(CustomerTypeQuery query) {
        return ResultUtils.data(customerTypeService.selectByQuery(query));
    }

    @Override
    public Result get(Long id) {
        CustomerType customerType = customerTypeService.selectByPrimaryKey(id);
        return ResultUtils.data("customerType", customerType);
    }

    @Override
    @Transactional
    public Result save(AdminCustomerTypeSaveRequestBody requestBody) {
        CustomerType customerType = new CustomerType();
        customerType.copyFrom(requestBody);
        customerTypeService.insert(customerType);
        return ResultUtils.saveOk();
    }

    @Override
    @Transactional
    public Result update(AdminCustomerTypeUpdateRequestBody requestBody) {
        CustomerType customerType = customerTypeService.selectByPrimaryKey(requestBody.getId());
        customerType.copyFrom(requestBody);
        customerTypeService.updateByPrimaryKeySelective(customerType);
        return ResultUtils.updateOk();
    }

    @Override
    @Transactional
    public Result delete(Long id) {
        customerTypeService.deleteByPrimaryKey(id);
        return ResultUtils.deleteOk();
    }

    @Override
    @Transactional
    public Result delete(List<Long> ids) {
        customerTypeService.deleteByIds(ids);
        return ResultUtils.deleteOk();
    }

}