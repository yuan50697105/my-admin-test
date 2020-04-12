package com.example.application.goods.controller;

import com.example.application.goods.pojo.info.GoodsInfoSaveRequestBody;
import com.example.application.goods.pojo.info.GoodsInfoUpdateRequestBody;
import com.example.application.goods.service.AdminGoodsInfoService;
import com.example.commons.db.mybatis.plus.sqlhelper.module.pojo.query.GoodsInfoQuery;
import com.example.commons.web.controller.BaseController;
import com.example.commons.web.pojo.Result;
import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 12:52
 */
@RestController
@RequestMapping("goods/info")
@AllArgsConstructor
@Validated
public class AdminGoodsInfoController extends BaseController {
    private AdminGoodsInfoService adminGoodsInfoService;

    @GetMapping("data")
    public Result data(GoodsInfoQuery query) {
        return adminGoodsInfoService.data(query);
    }

    @GetMapping("list")
    public Result list(GoodsInfoQuery query) {
        return adminGoodsInfoService.list(query);
    }


    @GetMapping(value = "get", params = "id")
    public Result get(Long id) {
        return adminGoodsInfoService.get(id);
    }

    @GetMapping(value = {"get/{id}","{id}"})
    public Result get2(@PathVariable("id") Long id) {
        return adminGoodsInfoService.get(id);
    }

    @PostMapping({"save", ""})
    public Result save(@RequestBody @Validated GoodsInfoSaveRequestBody requestBody, BindingResult result) {
        validate(result);
        return adminGoodsInfoService.save(requestBody);
    }

    @PostMapping("update")
    public Result update(@RequestBody @Validated GoodsInfoUpdateRequestBody requestBody, BindingResult result) {
        validate(result);
        return adminGoodsInfoService.update(requestBody);
    }

    @PutMapping
    public Result update2(@RequestBody @Validated GoodsInfoUpdateRequestBody requestBody, BindingResult result) {
        validate(result);
        return adminGoodsInfoService.update(requestBody);
    }

    @GetMapping(value = "delete", params = "id")
    public Result delete(@NotNull Long id) {
        return adminGoodsInfoService.delete(id);
    }

    @GetMapping(value = "delete", params = "ids")
    public Result delete(@NotEmpty List<Long> ids) {
        return adminGoodsInfoService.delete(ids);
    }

    @DeleteMapping("{id}")
    public Result delete2(@PathVariable("id") @NotNull Long id) {
        return adminGoodsInfoService.delete(id);
    }

    @GetMapping("delete/{id}")
    public Result delete3(@PathVariable("id") @NotNull Long id) {
        return adminGoodsInfoService.delete(id);
    }

}