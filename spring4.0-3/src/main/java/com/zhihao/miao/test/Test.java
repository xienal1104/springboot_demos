package com.zhihao.miao.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zhihao.miao.pojo.Person;

public class Test {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.zhihao.miao.pojo");
    	//context.getBean(User.class);
    	context.getBeansOfType(Person.class).values().forEach(System.out::println);
    	context.close();
    	
	}
}
