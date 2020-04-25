package org.yuan.cloudadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @program: cloud-admin
 * @description:
 * @author: yuane
 * @create: 2020-04-25 14:10
 */
@EnableEurekaServer
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudApplication.class, args);
    }
}