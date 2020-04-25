package org.yuan.showercloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @program: shower-cloud
 * @description:
 * @author: yuane
 * @create: 2020-04-25 19:46
 */

@EnableEurekaClient
@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudGatewayApplication.class, args);
    }
}