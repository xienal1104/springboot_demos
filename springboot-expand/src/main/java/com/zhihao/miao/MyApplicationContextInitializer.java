package com.zhihao.miao;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 1、ApplicationContextInitializer是在bean refresh的时候进行回调的方法，也就是说在spring容器初始化前完成的回调
 * 2、和监听器不一样，纳入到Spring容器中不生效。（@Commpont）
 */
public class MyApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
	public void initialize(ConfigurableApplicationContext applicationContext) {
		System.out.println("=====bean count====="+applicationContext.getBeanDefinitionCount());
	}

}
