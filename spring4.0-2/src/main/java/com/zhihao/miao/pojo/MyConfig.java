package com.zhihao.miao.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    
	@Bean(initMethod="init")
	public Car createCar(){
		return new Car();
	}
}
