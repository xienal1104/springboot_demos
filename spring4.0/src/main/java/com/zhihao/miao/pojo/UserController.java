package com.zhihao.miao.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//一般用在控制层
@Controller
public class UserController {
   
	@Autowired
	private UserService userService;

	@Override
	public String toString() {
		return "UserController [userService=" + userService + "]";
	}
	
}
