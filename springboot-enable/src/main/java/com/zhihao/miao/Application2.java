package com.zhihao.miao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Import用来导入一个或多个类（会被spring容器托管），或者配置类(配置类里面的bean都会被spring容器托管)
 */
@EnableConfigurationProperties
@EnableAsync
//@Import({User.class,Role.class,MyConfiguration.class})
//@Import(MyImportSelector.class)
@EnableLog(name="spring boot")
@ComponentScan
public class Application2 {
    public static void main(String[] args) {
    	ConfigurableApplicationContext context = SpringApplication.run(Application2.class, args);
    	System.out.println(context.getBean(User.class));
    	System.out.println(context.getBean(Role.class));
    	System.out.println(context.getBeansOfType(Runnable.class));
    	context.close();
	}
}
