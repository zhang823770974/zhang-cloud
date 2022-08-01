package com.cloud.ribbon.controller;

import com.cloud.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ribbon/HelloController")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/sayHi")
    public String sayHi(@RequestParam String name){
        return helloService.sayHi(name);
    }
}
