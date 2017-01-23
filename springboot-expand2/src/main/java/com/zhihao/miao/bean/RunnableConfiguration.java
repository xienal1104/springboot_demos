package com.zhihao.miao.bean;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class RunnableConfiguration {
    
	@Bean
	public Runnable createRunnable(){
		return () -> {};
	}
}
