package com.example.application.goods.controller;

import com.example.application.goods.pojo.type.GoodsTypeSaveRequestBody;
import com.example.application.goods.service.AdminGoodsTypeService;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.query.GoodsTypeQuery;
import com.example.commons.web.controller.BaseController;
import com.example.commons.web.pojo.Result;
import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping({"save", ""})
    public Result save(@RequestBody @Validated GoodsTypeSaveRequestBody requestBody, BindingResult result) {
        validate(result);
        return adminGoodsTypeService.save(requestBody);
    }
}