package com.zhihao.miao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private CounterService counterService;
	
	@Autowired
	private GaugeService gaugeService;
	
	@GetMapping("/user/home/{id}")
	public String home(@PathVariable String id){
		counterService.increment("user home");
		if("2".equals(id)){
			throw new NullPointerException();
		}
		return "home";
	}
	
	@PostMapping("/user/price")
	public String price(@RequestParam double price){
		gaugeService.submit("price", price);
		return "price"+price;
	}
}
