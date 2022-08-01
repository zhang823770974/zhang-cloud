package com.cloud.feign.feignclient;

import com.cloud.feign.hystrix.HystrixServiceHello;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// @FeignClient后加fallback指向熔断器的类，这个类应该实现本接口，并且它需要注册到IOC容器中
@FeignClient(value = "eureka-client-service",fallback = HystrixServiceHello.class)
public interface FeignServiceHello {

    @RequestMapping(value = "/eureka/EurekaClientController/home",method = RequestMethod.GET)
    String sayHelloFeign(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/eureka/EurekaClientController/myDemo",method = RequestMethod.POST)
    String myDemoFeign(@RequestParam(value = "name") String name);
}
