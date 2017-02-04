package com.zhihao.miao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application2 {
	public static void main(String[] args) {
		SpringApplication  application = new SpringApplication(Application2.class);
		//application.addInitializers(new MyApplicationContextInitializer());
		//application.addInitializers(new MyApplicationContextInitializer2());
		ConfigurableApplicationContext context = application.run(args);
		context.close();
	}
}
