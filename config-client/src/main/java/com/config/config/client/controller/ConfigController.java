package com.config.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取服务器配置
 *
 * @author huhaiqiang
 * @date 2018/11/02 15:58
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/config")
    public String hi(){
        return foo;
    }
}
