package com.lsl.springcloud_eureka_client_order_8003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudEurekaClientOrder8003Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaClientOrder8003Application.class,args);
    }

}
