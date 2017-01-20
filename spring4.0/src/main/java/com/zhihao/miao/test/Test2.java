package com.zhihao.miao.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zhihao.miao.pojo.AppContext;
import com.zhihao.miao.pojo.User;
import com.zhihao.miao.pojo.UserController;
import com.zhihao.miao.pojo.UserDao;
import com.zhihao.miao.pojo.UserService;

public class Test2 {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class,User.class,UserController.class,UserService.class,UserDao.class);
    	System.out.println(context.getBean("user"));
    	//报错，No qualifying bean of type 'com.zhihao.miao.pojo.User' available: expected single matching bean but found 2: user,createUser
    	//System.out.println(context.getBean(User.class));
    	//com.zhihao.miao.pojo.User@1d7acb34
    	//System.out.println(context.getBean("user"));
    	//{user=com.zhihao.miao.pojo.User@1d7acb34, createUser=com.zhihao.miao.pojo.User@1e4a7dd4}
    	//System.out.println(context.getBeansOfType(User.class));
    	
    	context.close();
    	
	}
}
