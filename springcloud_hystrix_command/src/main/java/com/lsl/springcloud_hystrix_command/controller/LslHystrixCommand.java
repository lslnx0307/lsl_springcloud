package com.lsl.springcloud_hystrix_command.controller;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;

/**
 * @program: lsl_springcloud
 * @description:
 * @author: v-jasperli
 * @create: 2019-04-30 13:34
 **/
@Slf4j
public class LslHystrixCommand extends HystrixCommand<String> {

    private RestTemplate restTemplate;



    @Override
    protected String run() throws Exception {
        return restTemplate.getForObject("http://ms-provider-order/home", String.class);
    }

    @Override
    protected String getFallback() {
        log.error("触发服务降级了。。。。。。");

        return "service fall back......";
    }

    public LslHystrixCommand(String commandGroupKey,RestTemplate restTemplate) {
        super(HystrixCommandGroupKey.Factory.asKey(commandGroupKey));
        this.restTemplate = restTemplate;
    }
}
