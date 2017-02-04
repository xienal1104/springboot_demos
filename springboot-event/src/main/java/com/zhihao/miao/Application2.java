package com.zhihao.miao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zhihao.event.EhcoApplicationEvent;

@SpringBootApplication
public class Application2 {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Application2.class);
		ConfigurableApplicationContext context = application.run(args);
		context.publishEvent(new EhcoApplicationEvent(new Object()));
		context.close();
	}
}
