package com.wp;

import javax.xml.ws.Endpoint;

public class WeatherServer {

	public static void main(String[] args) {
		//发布天气查询服务
		//第一个参数：webservice的地址
		//第二个参数:使用@WebService标记的服务对象
		Endpoint.publish("http://127.0.0.1:12345/weather", new WeatherInterfaceImpl());

		
	}

}
