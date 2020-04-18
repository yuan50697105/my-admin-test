package com.example.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @program: admin-demo-spring-cloud-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-18 12:33
 */
@EnableHystrix
@SpringCloudApplication
public class SpringCloudEurekaClientApplication012 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaClientApplication012.class, args);
    }
}