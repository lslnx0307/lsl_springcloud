package com.lsl.springcloud_feign_8000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.lsl")
@EnableDiscoveryClient
public class SpringcloudFeign8000Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFeign8000Application.class,args);
    }

}
