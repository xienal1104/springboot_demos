package com.zhihao.miao.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zhihao.miao.pojo.AnnotationScan;
import com.zhihao.miao.pojo.UserController;

public class Test4 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationScan.class);
		System.out.println(context.getBean(UserController.class));
		
		context.close();
	}
}
