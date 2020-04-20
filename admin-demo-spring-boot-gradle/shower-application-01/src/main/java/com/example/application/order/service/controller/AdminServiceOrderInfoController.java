package com.example.application.order.service.controller;

import com.example.application.order.service.pojo.AdminServiceOrderInfoSaveRequestBody;
import com.example.application.order.service.service.AdminServiceOrderInfoService;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.query.ServiceOrderInfoQuery;
import com.example.commons.web.base.controller.BaseController;
import com.example.commons.web.base.pojo.Result;
import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-12 21:13
 */
@RestController
@RequestMapping("order/service/info")
@AllArgsConstructor
@Validated
public class AdminServiceOrderInfoController extends BaseController {
    private final AdminServiceOrderInfoService adminServiceOrderInfoService;
    @GetMapping("data")
    public Result data(ServiceOrderInfoQuery query) {
        return adminServiceOrderInfoService.data(query);
    }

    @GetMapping("list")
    public Result list(ServiceOrderInfoQuery query) {
        return adminServiceOrderInfoService.list(query);
    }

    @GetMapping(value = "get", params = "id")
    public Result get(Long id) {
        return adminServiceOrderInfoService.get(id);
    }

    @GetMapping(value = "get", params = "ids")
    public Result get(List<Long> ids) {
        return adminServiceOrderInfoService.get(ids);
    }

    @GetMapping({"get/{id}", "{id}"})
    public Result get2( @PathVariable("id") Long id) {
        return adminServiceOrderInfoService.get(id);
    }

    @PostMapping({"save", ""})
    public Result save(@RequestBody @Validated AdminServiceOrderInfoSaveRequestBody requestBody, BindingResult result) {
        validate(result);
        return adminServiceOrderInfoService.save(requestBody);
    }
}