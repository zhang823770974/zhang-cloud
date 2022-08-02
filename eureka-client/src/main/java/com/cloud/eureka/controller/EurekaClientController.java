package com.cloud.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Eureka客户端
 */

@RestController
@RequestMapping("/eureka/EurekaClientController")
public class EurekaClientController {

    @Value("${server.port}")
    String port;

    @GetMapping("/home")
    public String home(@RequestParam(value="name",defaultValue = "zhang") String name){
        return "hi"+name+";it is port:"+port;
    }

    @PostMapping("/myDemo")
    public String myDemo(@RequestParam(value="name",defaultValue = "bo") String name){
        return "demo-hello:"+name+";看看port:"+port;
    }
}
