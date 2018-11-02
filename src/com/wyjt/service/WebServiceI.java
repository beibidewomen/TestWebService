package com.wyjt.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WebServiceI {
	
	@WebMethod
	public String sayHello(String name);
}
