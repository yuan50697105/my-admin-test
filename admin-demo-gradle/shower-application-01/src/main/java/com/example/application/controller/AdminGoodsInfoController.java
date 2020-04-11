package com.example.application.controller;

import com.example.application.service.AdminGoodsInfoService;
import com.example.commons.constants.RouteConstants;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.query.GoodsInfoQuery;
import com.example.commons.web.controller.BaseController;
import com.example.commons.web.pojo.Result;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-11 12:52
 */
@RestController
@RequestMapping(RouteConstants.AdminGoodsControllerConstants.GOODS)
@AllArgsConstructor
@Validated
public class AdminGoodsInfoController extends BaseController {
    private AdminGoodsInfoService adminGoodsInfoService;

    @GetMapping("data")
    public Result data(GoodsInfoQuery query) {
        return adminGoodsInfoService.data(query);
    }
}