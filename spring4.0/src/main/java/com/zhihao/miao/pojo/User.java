package com.zhihao.miao.pojo;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    
	//使用Spring提供的方式
	@Autowired
	private UserService userService;

	//JSR-250 的注解
	@Resource
	private Car car;

	//JSR-330 的注解,要加入inject依赖
	@Inject
	private Bus bus;

	@Override
	public String toString() {
		return "User [userService=" + userService + ", car=" + car + ", bus=" + bus + "]";
	}
	
}
