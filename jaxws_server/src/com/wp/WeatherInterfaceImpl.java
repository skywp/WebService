package com.wp;

public class WeatherInterfaceImpl implements WeatherInterface{

	@Override
	public String queryWeather(String cityName) {
		System.out.println("from client..."+cityName);
		String result = "晴天";
	
		System.out.println("to client..."+result);
		return result;
	}

}
