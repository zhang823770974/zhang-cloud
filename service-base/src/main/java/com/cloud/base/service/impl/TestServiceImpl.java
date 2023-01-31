/**
 * Copyright 2008-2009. Chongqing Communications Industry Services Co.,Ltd Information Technology Branch. All rights reserved.
 * <a>http://www.crunii.com</a>
 */
package com.cloud.base.service.impl;

import com.cloud.base.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author 张波 create 2022/8/3 10:24
 */
@Service
public class TestServiceImpl implements TestService {
	@Override public String getData(String param) {
		return param + "远程调用成功！";
	}
}
