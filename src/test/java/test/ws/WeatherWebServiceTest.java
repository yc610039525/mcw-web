package test.ws;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com._36wu.ResultOfTodayWeather;
import com._36wu.WeatherServiceSoap;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:spring*.xml")
public class WeatherWebServiceTest {
	@Autowired
	WeatherServiceSoap weatherServiceSoap;
	@Test
	public void testGetWeather(){
		ResultOfTodayWeather weather = weatherServiceSoap.getWeather("成都", "d34e3b539a644693a7e1a4f29daf3ea8");
		System.out.println(weather);
	}
}
