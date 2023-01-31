package com.cloud.feign.controller;

import com.cloud.feign.feignclient.FeignServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feign/HelloFeignController")
public class HelloFeignController {

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    private FeignServiceHello feignServiceHello;

    @GetMapping("/sayHi")
    public String sayHi(@RequestParam String name){
        return feignServiceHello.sayHelloFeign(name);
    }

    @PostMapping("/myDemo")
    public String myDemo(@RequestParam String name){
        return feignServiceHello.myDemoFeign(name);
    }


}
