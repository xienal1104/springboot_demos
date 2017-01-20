package com.zhihao.miao.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zhihao.miao.pojo.Dog;

public class Test {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.zhihao.miao.pojo");
    	
    	Dog dog = context.getBean(Dog.class);
    	dog.show();
    	//User user = (User)context.getBean("user");
    	//user.show();
    	
    	//Book book =context.getBean(Book.class);
    	//book.show();
    	
    	//Bank bank = context.getBean(Bank.class);
    	//bank.show();
    	
    	//Car car = context.getBean(Car.class);
    	
    	//User user = context.getBean(User.class);
    	//user.show();
    	context.close();
    	
    	
	} 
}
