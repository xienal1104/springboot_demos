package com.zhihao.miao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;

/*
*  异常处理
*  如何去掉spring boot默认的异常处理逻辑
*  @SpringBootApplication(exclude=ErrorMvcAutoConfiguration.class)
*   
*  使用ErrorPageRegistrar方法
*  写一个类，实现ErrorPageRegistrar接口，然后实现registerErrorPages方法，在该方法里面，添加具体的错误处理逻辑(类似web.xml里面配置错误处理方式)，这一种也是全局的异常处理
*   
*  只有在当前类中定义的异常处理还是局部的异常处理。
*    
*  全局异常处理步骤
*  1：写一个类，需要加上@ControllerAdvice注解
*  2：写一个异常处理方法，方法上面需要加上@ExceptionHandler(value=Exception.class)这个注解，在该方法里面处理异常
*   
*/
@SpringBootApplication(exclude=ErrorMvcAutoConfiguration.class)
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
