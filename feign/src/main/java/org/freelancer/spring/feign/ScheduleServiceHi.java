/*
 * Copyright (c) 2016 Qunar.com. All Rights Reserved.
 */
package org.freelancer.spring.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author abel created on 2018/3/27 下午10:22
 * @version $Id$
 */
@FeignClient(value = "hello-service")
public interface ScheduleServiceHi {
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
