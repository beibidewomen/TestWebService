
package com.wyjt.service;

import javax.jws.WebService;

@WebService
public class WebServiceImpl implements WebServiceI{

	@Override
	public String sayHello(String name) {
		return "hello world:" + name;
	}
}
