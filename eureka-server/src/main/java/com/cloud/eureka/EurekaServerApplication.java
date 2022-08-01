package com.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        System.out.println("测试打包成功。。。");
        // @EnableEurekaServer启动服务注册中心
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
