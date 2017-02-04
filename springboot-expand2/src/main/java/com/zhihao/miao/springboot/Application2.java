package com.zhihao.miao.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.google.gson.Gson;



@SpringBootApplication(scanBasePackages="com.zhihao.miao",excludeName="org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration")
//@SpringBootApplication(scanBasePackages="com.zhihao.miao",exclude=GsonAutoConfiguration.class)
public class Application2 {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Application2.class);
		ConfigurableApplicationContext context = application.run(args);
		System.out.println(context.getBean(Gson.class));
		context.close();
	}
}
