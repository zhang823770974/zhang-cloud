/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.cloud.feign.controller;

import com.cloud.feign.config.RestTemplateConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 张波 create 2022/8/3 11:02
 */
@Slf4j
@RestController
@RequestMapping(path = "/BaseTestController")
public class BaseTestController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/getData")
	public String getData(@RequestParam(name ="param") String param) {
		log.info("本地测试入参{}", param);
		return restTemplate.getForObject("http://localhost:8000/TestController/getData/" + param, String.class);
	}
}
