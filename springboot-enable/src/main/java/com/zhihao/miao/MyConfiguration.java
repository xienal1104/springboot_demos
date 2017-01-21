package com.zhihao.miao;

import org.springframework.context.annotation.Bean;

public class MyConfiguration {
    
	@Bean
	public Runnable createRunnable(){
		return () -> {};
	}
	
	@Bean
	public Runnable createRunnable2(){
		return () -> {};
	}
}
