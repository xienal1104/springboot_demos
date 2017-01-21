package com.zhihao.miao;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * @Profile注解可以修饰类，也可以修饰方法，不同注解参数来选择不同环境进行加载初始化不同的bean,参数value的类型是数组
 * @author zhihao.miao
 *
 */
@SpringBootConfiguration
@Profile("test")
public class MyConfig {

	@Bean
	//@Profile(value="dev")
	public Runnable createRunnable(){
		System.out.println("======dev==========");
		return () -> {};
	}
	
	@Bean
	//@Profile(value="test")
	public Runnable createRunnable2(){
		System.out.println("======test==========");
		return () -> {};
	}
	
	@Bean
	//@Profile(value="pro")
	public Runnable createRunnable3(){
		System.out.println("======pro===========");
		return () -> {};
	}
}
