package com.xinxin.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg() {
        return "this is product' msg";
    }

    @Value("${server.port}")
    String port;

    /**
     * feign loadbanlance负载均衡测试
     *
     * @param name
     * @return
     */
    @GetMapping("/loadbanlanceTest")
    public String loadbanlanceTest(@RequestParam(value = "name",required = false) String name) {
        return "hello " + name + ", i'm provider ,my port:" + port;
    }
}
