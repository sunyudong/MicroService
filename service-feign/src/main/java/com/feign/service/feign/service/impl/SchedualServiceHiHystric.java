package com.feign.service.feign.service.impl;

import com.feign.service.feign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * 测试类
 *
 * @author huhaiqiang
 * @date 2018/10/31 18:13
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry\n" + name;
    }
}
