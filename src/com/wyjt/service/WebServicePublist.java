package com.wyjt.service;

import javax.xml.ws.Endpoint;

/**
 * @author user
 */
public class WebServicePublist {
	public static void main(String[] args) {
		String address = "http://192.168.5.181:8090/WS_Server/Webservice";
		Endpoint.publish(address, new WebServiceImpl());
		System.out.println("webservice发布成功");
	}
}
