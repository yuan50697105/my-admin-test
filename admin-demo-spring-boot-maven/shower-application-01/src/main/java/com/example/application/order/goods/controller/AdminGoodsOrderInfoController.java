package com.example.application.order.goods.controller;

import com.example.application.order.goods.pojo.AdminGoodsOrderInfoSaveRequestBody;
import com.example.application.order.goods.service.AdminGoodsOrderInfoService;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.query.GoodsOrderInfoQuery;
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
 * @create: 2020-04-12 20:25
 */
@RestController
@RequestMapping("order/goods/info")
@AllArgsConstructor
@Validated
public class AdminGoodsOrderInfoController extends BaseController {
    private final AdminGoodsOrderInfoService adminGoodsOrderInfoService;

    @GetMapping("data")
    public Result data(GoodsOrderInfoQuery query) {
        return adminGoodsOrderInfoService.data(query);
    }

    @GetMapping("list")
    public Result list(GoodsOrderInfoQuery query) {
        return adminGoodsOrderInfoService.list(query);
    }

    @GetMapping(value = "get", params = "id")
    public Result get(Long id) {
        return adminGoodsOrderInfoService.get(id);
    }

    @GetMapping(value = "get", params = "ids")
    public Result get(List<Long> ids) {
        return adminGoodsOrderInfoService.get(ids);
    }

    @GetMapping({"get/{id}", "{id}"})
    public Result get2(@PathVariable("id") Long id) {
        return adminGoodsOrderInfoService.get(id);
    }

    @PostMapping({"save", ""})
    public Result save(@RequestBody @Validated AdminGoodsOrderInfoSaveRequestBody requestBody, BindingResult result) {
        validate(result);
        return adminGoodsOrderInfoService.save(requestBody);
    }


}