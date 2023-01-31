/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.cloud.feign.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * 注册RestTemplate，用于服务远程调用
 * @author 张波 create 2022/8/3 9:56
 */
@Configuration
public class RestTemplateConfiguration {

	@Bean("baRestTemplate")
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
