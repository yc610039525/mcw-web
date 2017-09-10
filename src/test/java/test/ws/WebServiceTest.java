package test.ws;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class WebServiceTest {
	Logger logger=Logger.getLogger("WebServiceTest");
	private static ApplicationContext context = null;
	@BeforeClass
	public static void preHandler(){
		context = new ClassPathXmlApplicationContext("classpath*:spring*.xml");
	}
	@Test
	public void getWeatherTest() {
		
	}

}
