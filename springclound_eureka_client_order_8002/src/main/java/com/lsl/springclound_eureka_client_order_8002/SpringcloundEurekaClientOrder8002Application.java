package com.lsl.springclound_eureka_client_order_8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloundEurekaClientOrder8002Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloundEurekaClientOrder8002Application.class, args);
    }

}
