package com.zhihao.miao.pojo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Train {
   
	@PostConstruct
	public void initial(){
		System.out.println("......initial......");
	}
	
	@PreDestroy
	public void close(){
		System.out.println("......close.........");
	}
}
