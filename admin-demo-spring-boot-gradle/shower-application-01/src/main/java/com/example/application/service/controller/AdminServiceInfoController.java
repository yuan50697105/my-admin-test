package com.example.application.service.controller;

import com.example.commons.web.base.controller.BaseController;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-12 21:08
 */
@RestController
@RequestMapping("service/info")
@AllArgsConstructor
@Validated
public class AdminServiceInfoController extends BaseController {

}