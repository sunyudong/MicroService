package com.feign.service.feign.service;

import com.feign.service.feign.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 熔断测试接口
 *
 * @author huhaiqiang
 * @date 2018/10/31 17:20
 */
@FeignClient(value = "service-client",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    /**
     * 测试接口
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
