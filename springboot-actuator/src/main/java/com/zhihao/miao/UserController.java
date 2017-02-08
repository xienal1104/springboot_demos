package com.zhihao.miao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/user/home")
	public String home(){
		return "home";
	}
	
	@PostMapping("/user/create")
	public String create(){
		return "create";
	}
}
