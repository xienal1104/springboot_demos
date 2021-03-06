package com.zhihao.miao.pojo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * ʵ���߼����գ�ApplicationContextAwareProcessor
 *
 */
@Component
public class Book implements ApplicationContextAware {
	
	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	public void show(){
		System.out.println("book : "+applicationContext.getClass());
	}

}
