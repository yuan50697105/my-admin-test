package com.example.cloud.service;

import com.example.cloud.service.fallback.BaseServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: admin-demo-spring-cloud-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-18 20:11
 */
@FeignClient(value = "BASE-SERVICE", fallback = BaseServiceFallBack.class)
public interface BaseService {
    @RequestMapping("aaa")
    public String aaa();
}
