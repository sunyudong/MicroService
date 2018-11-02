package com.eureka.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * HelloWord
 *
 * @author huhaiqiang
 * @date 2018/10/31 16:48
 */
@RestController
public class HomeController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "TheSwordEmperor") String name) {
        return "hi " + name + " ,i am from port:" + port + ",time:" + new Date();
    }
}
