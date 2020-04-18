package com.example.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @program: admin-demo-spring-cloud-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-18 12:43
 */
@EnableZuulProxy
@EnableHystrix
@SpringCloudApplication
public class SpringCloudZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuulApplication.class, args);
    }
}