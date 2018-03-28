/*
 * Copyright (c) 2016 Qunar.com. All Rights Reserved.
 */
package org.freelancer.spring.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author abel created on 2018/3/27 下午9:10
 * @version $Id$
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://HELLO-SERVICE/hello?name=" + name, String.class);
    }
}
