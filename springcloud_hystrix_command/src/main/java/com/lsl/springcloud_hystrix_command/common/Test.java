package com.lsl.springcloud_hystrix_command.common;

/**
 * @program: lsl_springcloud
 * @description:
 * @author: v-jasperli
 * @create: 2019-04-29 17:54
 **/
public class Test {

    public static void main(String[] args) {
        String s = new CommandHelloWorld("123").execute();
        System.out.println(s);
    }
}
