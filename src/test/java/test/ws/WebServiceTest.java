package test.ws;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com._36wu.ResultOfTodayWeather;
import com._36wu.WeatherServiceSoap;

public class WebServiceTest {
	Logger logger=Logger.getLogger("WebServiceTest");
	private static ApplicationContext context = null;
	@BeforeClass
	public static void preHandler(){
		context = new ClassPathXmlApplicationContext("classpath*:spring*.xml");
	}
	@Test
	public void getWeatherTest() {
		WeatherServiceSoap weatherServiceSoap = (WeatherServiceSoap)context.getBean("weatherServiceSoap"); 
		ResultOfTodayWeather weather = weatherServiceSoap.getWeather("武漢", "");
		logger.info(weather);
	}

}
