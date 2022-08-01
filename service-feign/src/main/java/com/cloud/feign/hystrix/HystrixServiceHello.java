package com.cloud.feign.hystrix;

import com.cloud.feign.feignclient.FeignServiceHello;
import org.springframework.stereotype.Component;

// @Component把该类注册到IOC容器
@Component
public class HystrixServiceHello implements FeignServiceHello {

    @Override
    public String sayHelloFeign(String name) {
        return "sorry!"+name+",gg";
    }

    @Override
    public String myDemoFeign(String name) {
        return "sorry!"+name+",nonDemo";
    }

}
