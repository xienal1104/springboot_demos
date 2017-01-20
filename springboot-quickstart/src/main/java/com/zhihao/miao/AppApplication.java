package com.zhihao.miao;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class AppApplication {
	
	@Bean
	public Runnable createRunnable(){
		return new Runnable() {
			@Override
			public void run() {
				System.out.println("spring boot is run");
			}
		};
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AppApplication.class, args);
		Runnable runnable = (Runnable)context.getBean("createRunnable");
		System.out.println((List)context.getBean("createList"));
		System.out.println(context.getBean(User.class));
		runnable.run();
	}
}
