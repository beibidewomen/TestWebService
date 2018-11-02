package com.wyjt.service.test;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.encoding.XMLType;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class TestWebService {
	public static void main(String[] args) {
		try {  
            String endpoint = "http://192.168.5.181:8090/WS_Server/Webservice?wsdl";  
            // 直接引用远程的wsdl文件  
            // 以下都是套路  
            Service service = new Service();  
            Call call = (Call) service.createCall();  
            call.setTargetEndpointAddress(endpoint);  
            call.setOperationName(new QName("http://service.wyjt.com/","sayHello"));//WSDL里面描述的接口名称
            call.addParameter("arg0", XMLType.XSD_STRING,
                    ParameterMode.IN);//接口的参数
            call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);// 设置返回类型  
            String temp = "xzw";  
            String result = (String)call.invoke(new Object[] {temp});  
            // 给方法传递参数，并且调用方法  
            System.out.println(result);  
        } catch (Exception e) {  
            System.err.println(e.toString());  
        } 
	}
}
