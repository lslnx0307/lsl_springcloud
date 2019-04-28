package com.lsl.springcloud_eureka_client_order_8003.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/home")
    public String home() {
        System.out.println("home_8003");
        return "home_8003";
    }
}
