package com.example.application.test;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @program: admin-demo-spring-boot-maven
 * @description:
 * @author: yuane
 * @create: 2020-05-07 22:02
 */
@Service
@AllArgsConstructor
public class TestServiceImpl implements TestService {
    @Override
    public Result<?> add() {
        return ResultInfo.success();
    }
}