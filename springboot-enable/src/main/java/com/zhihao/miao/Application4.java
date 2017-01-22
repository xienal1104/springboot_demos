package com.zhihao.miao;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


@Import(MyImportBeanDefinitionRegistrar.class)
public class Application4 {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application4.class, args);
		System.out.println(context.getBeansOfType(User.class));
		System.out.println(context.getBeansOfType(Role.class));
		System.out.println(context.getBeansOfType(Runnable.class));
		context.close();
	}
}
