package com.example.application.goods.controller;

import com.example.application.goods.pojo.type.GoodsTypeSaveRequestBody;
import com.example.application.goods.pojo.type.GoodsTypeUpdateRequestBody;
import com.example.application.goods.service.AdminGoodsTypeService;
import com.example.commons.db.mybatis.base.sqlhelper.module.pojo.query.GoodsTypeQuery;
import com.example.commons.web.controller.BaseController;
import com.example.commons.web.pojo.Result;
import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 13:35
 */
@RestController
@RequestMapping("goods/type")
@AllArgsConstructor
@Validated
public class AdminGoodsTypeController extends BaseController {
    private AdminGoodsTypeService adminGoodsTypeService;

    @GetMapping("data")
    public Result data(GoodsTypeQuery query) {
        return adminGoodsTypeService.data(query);
    }

    @GetMapping("list")
    public Result list(GoodsTypeQuery query) {
        return adminGoodsTypeService.list(query);
    }

    @GetMapping(value = "get", params = "id")
    public Result get(@NotNull Long id) {
        return adminGoodsTypeService.get(id);
    }

    @GetMapping({"get/{id}", "{id}"})
    public Result get2(@PathVariable("id") @NotNull Long id) {
        return adminGoodsTypeService.get(id);
    }

    @PostMapping({"save", ""})
    public Result save(@RequestBody @Validated GoodsTypeSaveRequestBody requestBody, BindingResult result) {
        validate(result);
        return adminGoodsTypeService.save(requestBody);
    }

    @PostMapping("update")
    public Result update(@RequestBody @Validated GoodsTypeUpdateRequestBody requestBody, BindingResult result) {
        validate(result);
        return adminGoodsTypeService.update(requestBody);
    }

    @PutMapping
    public Result update2(@RequestBody @Validated GoodsTypeUpdateRequestBody requestBody, BindingResult result) {
        validate(result);
        return adminGoodsTypeService.update(requestBody);
    }

    @GetMapping(value = "delete", params = "id")
    public Result delete(Long id) {
        return adminGoodsTypeService.delete(id);
    }

    @GetMapping(value = "delete", params = "ids")
    public Result delete(List<Long> ids) {
        return adminGoodsTypeService.delete(ids);
    }

    @DeleteMapping("{id}")
    public Result delete2(@PathVariable("id") Long id) {
        return adminGoodsTypeService.delete(id);
    }

    @GetMapping("delete/{id}")
    public Result delete3(@PathVariable("id") Long id) {
        return adminGoodsTypeService.delete(id);
    }

}