package com.example.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: admin-demo-spring-cloud-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-18 12:33
 */
@EnableHystrix
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableEurekaClient
@EnableFeignClients
@SpringCloudApplication
public class SpringCloudEurekaClientApplication01 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaClientApplication01.class, args);
    }
}