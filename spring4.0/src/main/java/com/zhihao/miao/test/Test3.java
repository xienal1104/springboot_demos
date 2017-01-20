package com.zhihao.miao.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Primary;

import com.zhihao.miao.pojo.UserDao;
import com.zhihao.miao.pojo.UserService;

public class Test3 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.zhihao.miao.pojo");
		System.out.println(context.getBeansOfType(UserDao.class));
		UserService userService = context.getBean(UserService.class);
		//默认情况下注入的是@Repository标签的类，如果在实例化的bean加上@Primary注解，那么就会在注入的时候优先注入有@Primary注解的对象，
		//当然也可以在注入的时候人为指定要注入哪个bean
		System.out.println(userService);
		
		context.close();
	}
}
