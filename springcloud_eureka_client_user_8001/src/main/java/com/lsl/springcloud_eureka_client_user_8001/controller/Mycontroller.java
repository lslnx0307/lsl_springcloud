package com.lsl.springcloud_eureka_client_user_8001.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Mycontroller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello() {
        System.out.println("hello");
        String s = restTemplate.getForObject("http://ms-provider-order/home", String.class);
        System.out.println("获取到到值："+ s);
        return "hello";
    }

}
