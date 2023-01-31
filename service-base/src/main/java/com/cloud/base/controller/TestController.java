/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.cloud.base.controller;

import com.cloud.base.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 张波 create 2022/8/3 10:59
 */
@RestController
@RequestMapping("/TestController")
@Slf4j
public class TestController {

	@Autowired
	private TestService testService;

	@GetMapping(value = "/getData/{param}")
	public String getData(@PathVariable("param") String param) {
		/**
		 * @PathVariable("param")映射URL中{param}绑定的占位符
		 * @RequestParam(name ="param")对应URL中 ?param=xxx
 		 */
		return testService.getData(param);
	}
}
