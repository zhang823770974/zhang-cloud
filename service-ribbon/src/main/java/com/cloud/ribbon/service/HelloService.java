package com.cloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    // @HystrixCommand注解对该方法创建熔断器功能，如果熔断调用sayError方法
    // 想要测试熔断，直接把该方法调用的项目停止，这时就可以调用熔断方法sayError
    @HystrixCommand(fallbackMethod = "sayError")
    public String sayHi(String name){
        // 通过项目名调用方法
        return restTemplate.getForObject("http://eureka-client-service/eureka/EurekaClientController/home?name="+name,String.class);
    }

    public String sayError(String name){
        log.info("就想打印一下日志。。。");
        return "sorry!"+name+", it is error!";
    }

}
