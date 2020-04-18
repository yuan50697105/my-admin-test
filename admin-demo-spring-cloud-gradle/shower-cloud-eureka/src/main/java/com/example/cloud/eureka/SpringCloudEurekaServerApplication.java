package com.example.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: admin-demo-spring-cloud-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-18 12:24
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServerApplication.class, args);
    }
}