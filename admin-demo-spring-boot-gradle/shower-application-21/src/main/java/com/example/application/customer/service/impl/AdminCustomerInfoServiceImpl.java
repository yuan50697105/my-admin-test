package com.example.application.customer.service.impl;

import com.example.application.customer.pojo.info.AdminCustomerInfoSaveRequestBody;
import com.example.application.customer.pojo.info.AdminCustomerInfoUpdateRequestBody;
import com.example.application.customer.service.AdminCustomerInfoService;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.CustomerInfo;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.query.CustomerInfoQuery;
import com.example.commons.db.mybatis.plus.pagehelper.module.service.CustomerInfoService;
import com.example.commons.web.base.pojo.Result;
import com.example.commons.web.base.utils.ResultUtils;
import com.example.db.pojo.IPageResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 13:46
 */
@Service
@AllArgsConstructor
public class AdminCustomerInfoServiceImpl implements AdminCustomerInfoService {
    private CustomerInfoService customerInfoService;

    @Override
    public Result data(CustomerInfoQuery query) {
        IPageResult<CustomerInfo> pageResult = customerInfoService.selectPageByQuery(query);
        return ResultUtils.data(pageResult);
    }

    @Override
    public Result list(CustomerInfoQuery query) {
        return ResultUtils.data(customerInfoService.selectByQuery(query));
    }

    @Override
    public Result get(Long id) {
        CustomerInfo customerInfo = customerInfoService.getById(id);
        return ResultUtils.data("CustomerInfo", customerInfo);
    }

    @Override
    @Transactional
    public Result save(AdminCustomerInfoSaveRequestBody requestBody) {
        CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.copyFrom(requestBody);
        customerInfoService.save(customerInfo);
        return ResultUtils.saveOk();
    }

    @Override
    @Transactional
    public Result update(AdminCustomerInfoUpdateRequestBody requestBody) {
        CustomerInfo customerInfo = customerInfoService.getById(requestBody.getId());
        customerInfo.copyFrom(customerInfo);
        customerInfoService.updateById(customerInfo);
        return ResultUtils.updateOk();
    }

    @Override
    @Transactional
    public Result delete(Long id) {
        customerInfoService.removeById(id);
        return ResultUtils.deleteOk();
    }

    @Override
    @Transactional
    public Result delete(List<Long> ids) {
        customerInfoService.removeByIds(ids);
        return ResultUtils.deleteOk();
    }


}