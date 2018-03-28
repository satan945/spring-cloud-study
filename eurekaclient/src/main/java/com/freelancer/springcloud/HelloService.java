/*
 * Copyright (c) 2016 Qunar.com. All Rights Reserved.
 */
package com.freelancer.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author abel created on 2018/3/21 下午6:30
 * @version $Id$
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class HelloService {

    public static void main(String[] args) {
        SpringApplication.run(HelloService.class, args);
    }

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String home(@RequestParam String name) {
        return "Hello" + name + "!~~~" + "I am from port:" + port;
    }

}
