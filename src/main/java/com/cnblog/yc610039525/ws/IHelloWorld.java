package com.cnblog.yc610039525.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;

@WebService(targetNamespace="http://ws.yc610039525.cnblog.com",name="IHelloWorld",serviceName="IHelloWorldserviceName")
public interface IHelloWorld {  
	  @WebMethod(action="sayHiMethod",operationName="sayHiMethod")
	  @RequestWrapper(localName = "sayHiMethod", targetNamespace = "http://ws.yc610039525.cnblog.com")
	  @WebResult(name="msgResult",targetNamespace="http://ws.yc610039525.cnblog.com") 
	  String sayHi(@WebParam(name="textParam") String text);     
}  
