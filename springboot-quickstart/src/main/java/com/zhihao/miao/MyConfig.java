package com.zhihao.miao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@SpringBootConfiguration
public class MyConfig {
	
	@Bean
	public List createList(){
		List arrayList = new ArrayList();
		arrayList.add("hehe");
		arrayList.add("haha");
		return arrayList;
	}
}
