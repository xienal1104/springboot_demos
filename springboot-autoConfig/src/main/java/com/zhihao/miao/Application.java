package com.zhihao.miao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ch.qos.logback.core.joran.conditional.Condition;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println(System.getProperty("file.encoding"));
		System.out.println(context.getBeansOfType(EncodingConvert.class));
		System.out.println(context.getBeansOfType(Runnable.class));
		context.close();
	}
}
