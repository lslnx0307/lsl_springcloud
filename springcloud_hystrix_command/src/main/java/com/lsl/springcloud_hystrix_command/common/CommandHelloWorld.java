package com.lsl.springcloud_hystrix_command.common;


import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

/**
 * @program: lsl_springcloud
 * @description:
 * @author: v-jasperli
 * @create: 2019-04-29 17:45
 **/
public class CommandHelloWorld extends HystrixCommand<String> {

    private final String name;

    public CommandHelloWorld(String name) {
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));
        this.name = name;
    }

    @Override
    protected String run() throws Exception {
        return "hello" + name;
    }
}
