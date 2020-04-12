package com.example.application.customer.controller;

import com.example.application.customer.pojo.type.AdminCustomerTypeSaveRequestBody;
import com.example.application.customer.pojo.type.AdminCustomerTypeUpdateRequestBody;
import com.example.application.customer.service.AdminCustomerTypeService;
import com.example.commons.db.mybatis.plus.pagehelper.module.pojo.query.CustomerTypeQuery;
import com.example.commons.web.controller.BaseController;
import com.example.commons.web.pojo.Result;
import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 21:31
 */
@RestController
@RequestMapping("customer/type")
@AllArgsConstructor
@Validated
public class AdminCustomerTypeController extends BaseController {
    private AdminCustomerTypeService adminCustomerTypeService;

    @GetMapping("data")
    public Result data(CustomerTypeQuery query) {
        return adminCustomerTypeService.data(query);
    }

    @GetMapping("list")
    public Result list(CustomerTypeQuery query) {
        return adminCustomerTypeService.list(query);
    }

    @GetMapping(value = "get", params = "id")
    public Result get(Long id) {
        return adminCustomerTypeService.get(id);
    }

    @GetMapping({"get/{id}", "{id}"})
    public Result get2(@PathVariable("id") Long id) {
        return adminCustomerTypeService.get(id);
    }

    @PostMapping({"", "save"})
    public Result save(@RequestBody @Validated AdminCustomerTypeSaveRequestBody requestBody, BindingResult result) {
        validate(result);
        return adminCustomerTypeService.save(requestBody);
    }

    @PostMapping("update")
    public Result update(@RequestBody @Validated AdminCustomerTypeUpdateRequestBody requestBody, BindingResult result) {
        validate(result);
        return adminCustomerTypeService.update(requestBody);
    }

    @PutMapping
    public Result update2(@RequestBody @Validated AdminCustomerTypeUpdateRequestBody requestBody, BindingResult result) {
        validate(result);
        return adminCustomerTypeService.update(requestBody);
    }

    @GetMapping(value = "delete", params = "id")
    public Result delete(Long id) {
        return adminCustomerTypeService.delete(id);
    }

    @GetMapping(value = "delete", params = "ids")
    public Result delete(List<Long> ids) {
        return adminCustomerTypeService.delete(ids);
    }

    @DeleteMapping("{id}")
    public Result delete2(@PathVariable("id") Long id) {
        return adminCustomerTypeService.delete(id);
    }

    @GetMapping("delete/{id}")
    public Result delete3(@PathVariable("id") Long id) {
        return adminCustomerTypeService.delete(id);
    }

}