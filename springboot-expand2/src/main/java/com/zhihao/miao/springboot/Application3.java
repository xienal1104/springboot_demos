package com.zhihao.miao.springboot;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application3 {
	
	@Value("${server.host:localhost}")
	private String serverHost;
	
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Application3.class);
		Map<String, Object> defaultProperties = new HashMap<String,Object>();
		defaultProperties.put("server.host", "192.168.1.121");
		application.setDefaultProperties(defaultProperties);
		Properties defaultProperties2 = new Properties();
		defaultProperties2.put("server.ip", "8080");
		application.setDefaultProperties(defaultProperties2);
		ConfigurableApplicationContext context = application.run(args);
		System.out.println(context.getEnvironment().getProperty("server.host", "127.0.0.1"));
		System.out.println(context.getBean(Application3.class).serverHost);
		System.out.println(context.getEnvironment().getProperty("server.ip"));
		context.close();
	}
}
