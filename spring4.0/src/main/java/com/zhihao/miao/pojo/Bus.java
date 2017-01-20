package com.zhihao.miao.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


/**
 * 第一种方法继承ApplicationContextAware或者InitializingBean和DisposableBean，其实现就是初始化(在bean初始化之前）和销毁方法）
 * 
 * 我发现setApplicationContext（ApplicationContextAware的方法）和afterPropertiesSet（DisposableBean的方法）都是在构造方法执行之后执行
 * 前者的作用是在Spring容器初始化的时候将applicationContext注入进来、
 */
public class Bus implements ApplicationContextAware,InitializingBean, DisposableBean {
	
	private ApplicationContext applicationContext;
	
	public Bus(){
		System.out.println("==== bus Construor =====");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println(applicationContext);
		System.out.println("=============setApplicationContext==========");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("==============afterPropertiesSet==========");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("=================destroy===================");
	}

}
