package test.ws;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.cnblog.yc610039525.ws.IHelloWorld;

public class HelloWorldWebServiceClientTest {
	private final static String ADDRESS = "http://localhost/spring.framework/cxf/helloWorld";  
	   public static void main(String args[]) {  
	      JaxWsProxyFactoryBean jwpFactory = new JaxWsProxyFactoryBean();  
	      jwpFactory.setAddress(ADDRESS);  
	      jwpFactory.setServiceClass(IHelloWorld.class);  
	      IHelloWorld hw = (IHelloWorld)jwpFactory.create();  
	      String response = hw.sayHi("world");  
	      System.out.println(response); 
	   }  
}
