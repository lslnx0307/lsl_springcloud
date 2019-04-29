package com.lsl.springcloud_eureka_order_8002.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/home")
    public String home() {
        System.out.println("home_8002");
        return "home_8002";
    }
}
