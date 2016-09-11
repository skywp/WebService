package com.wp.client;

import com.wp.WeatherInterfaceImpl;
import com.wp.WeatherInterfaceImplService;

public class WeatherClient {
	public static void main(String[] args) {
		//创建服务视图对象
		WeatherInterfaceImplService weatherInterfaceImplService = new WeatherInterfaceImplService();
		
		//通过服务视图得到portType
		WeatherInterfaceImpl weatherInterfaceImpl=weatherInterfaceImplService.getWeatherInterfaceImplPort();
		
		//调用WebService
		String result = weatherInterfaceImpl.queryWeather("北京");
		System.out.println(result);
	}
}
