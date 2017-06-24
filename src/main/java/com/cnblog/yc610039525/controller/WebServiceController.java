package com.cnblog.yc610039525.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com._36wu.ResultOfTodayWeather;
import com._36wu.WeatherServiceSoap;

@Controller
@RequestMapping("/webService")
public class WebServiceController {
	@Autowired
	private WeatherServiceSoap weatherServiceSoap;
	@RequestMapping("/getWeather.do")
	
	public /*String*/@ResponseBody ResultOfTodayWeather  getWeather(@RequestParam ("city") String city,HttpServletResponse response) throws IOException{
		ResultOfTodayWeather weather = weatherServiceSoap.getWeather(city, "");
//		PrintWriter writer = response.getWriter();
//		writer.print(weather.toString());
//		writer.close();
		return weather;
//		return "/view/success";
	}

}
