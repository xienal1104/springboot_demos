package com.zhihao.miao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileController {

	@GetMapping("/mobile/buy")
	public String buyMobile(){
		throw new ArithmeticException("the mobile is not found");
	}
	
	@GetMapping("/mobile/query")
	public String queryMobilePrice() throws ClassNotFoundException{
		throw new ClassNotFoundException("this is mobile is not found");
	}
}
