package com.zhihao.miao.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zhihao.miao.pojo.AppContext;
import com.zhihao.miao.pojo.Bike;
import com.zhihao.miao.pojo.Bus;
import com.zhihao.miao.pojo.Course;
import com.zhihao.miao.pojo.Train;

public class Test {
     public static void main(String[] args) {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);
		System.out.println(context.getBean("coursee"));
		System.out.println(context.getBean(Course.class));
		
		System.out.println(context.getBean("createRunnableFactoryBean"));//com.zhihao.miao.pojo.Jeep@117e949d
		System.out.println(context.getBean("&createRunnableFactoryBean"));  //com.zhihao.miao.pojo.RunnableFactoryBean@7a36aefa
		
		System.out.println(context.getBean("createCar"));
		
		System.out.println(context.getBean(Bus.class));
		
		System.out.println(context.getBean(Bike.class));
		
		System.out.println(context.getBean(Train.class));
		
		context.close();
		
	}
}
