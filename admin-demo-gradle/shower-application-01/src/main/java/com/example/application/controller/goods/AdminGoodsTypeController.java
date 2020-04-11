package com.example.application.controller.goods;

import com.example.application.service.goods.AdminGoodsTypeService;
import com.example.commons.web.controller.BaseController;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}