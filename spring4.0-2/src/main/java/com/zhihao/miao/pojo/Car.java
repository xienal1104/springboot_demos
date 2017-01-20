package com.zhihao.miao.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class Car {
    
	
    private ApplicationContext applicationContext;
    
    @Autowired
	public void setApplication(ApplicationContext applicationContext) {
    	System.out.println("=========set=========");
		this.applicationContext = applicationContext;
	}

	public void show(){
		System.out.println("================show=========="+applicationContext.getClass());
	}
	
	public void init(){
		System.out.println("===== Car init ==========");
	}
}
