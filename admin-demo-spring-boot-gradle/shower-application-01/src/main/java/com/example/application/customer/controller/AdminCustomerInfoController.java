package com.example.application.customer.controller;

import com.example.application.customer.pojo.info.AdminCustomerInfoSaveRequestBody;
import com.example.application.customer.pojo.info.AdminCustomerInfoUpdateRequestBody;
import com.example.application.customer.service.AdminCustomerInfoService;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.query.CustomerInfoQuery;
import com.example.commons.web.controller.BaseController;
import com.example.commons.web.pojo.Result;
import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 13:43
 */
@RestController
@RequestMapping("customer/info")
@AllArgsConstructor
@Validated
public class AdminCustomerInfoController extends BaseController {
    private AdminCustomerInfoService adminCustomerInfoService;

    @GetMapping("data")
    public Result data(CustomerInfoQuery query) {
        return adminCustomerInfoService.data(query);
    }

    @GetMapping("list")
    public Result list(CustomerInfoQuery query) {
        return adminCustomerInfoService.list(query);
    }

    @GetMapping(value = "get", params = "id")
    public Result get(Long id) {
        return adminCustomerInfoService.get(id);
    }

    @GetMapping({"get/{id}", "{id}"})
    public Result get2(@PathVariable("id") Long id) {
        return adminCustomerInfoService.get(id);
    }

    @PostMapping({"", "save"})
    public Result save(@RequestBody @Validated AdminCustomerInfoSaveRequestBody requestBody, BindingResult result) {
        validate(result);
        return adminCustomerInfoService.save(requestBody);
    }

    @PostMapping("update")
    public Result update(@RequestBody @Validated AdminCustomerInfoUpdateRequestBody requestBody, BindingResult result) {
        validate(result);
        return adminCustomerInfoService.update(requestBody);
    }

    @PutMapping
    public Result update2(@RequestBody @Validated AdminCustomerInfoUpdateRequestBody requestBody, BindingResult result) {
        validate(result);
        return adminCustomerInfoService.update(requestBody);
    }

    @GetMapping(value = "delete", params = "id")
    public Result delete(Long id) {
        return adminCustomerInfoService.delete(id);
    }

    @GetMapping(value = "delete", params = "ids")
    public Result delete(List<Long> ids) {
        return adminCustomerInfoService.delete(ids);
    }

    @DeleteMapping("{id}")
    public Result delete2(@PathVariable("id") Long id) {
        return adminCustomerInfoService.delete(id);
    }

    @GetMapping("delete/{id}")
    public Result delete3(@PathVariable("id") Long id) {
        return adminCustomerInfoService.delete(id);
    }

}