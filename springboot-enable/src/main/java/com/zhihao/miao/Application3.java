package com.zhihao.miao;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@EnableEcho(packages={"com.zhihao.miao.pojo","com.zhihao.miao.vo"})
public class Application3 {
     public static void main(String[] args) {
    	 ConfigurableApplicationContext context = SpringApplication.run(Application3.class, args);
    	 context.close();
	}
}
