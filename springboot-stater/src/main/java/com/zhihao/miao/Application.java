package com.zhihao.miao;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  自己开发一个spring boot starter的步骤
 *  1：新建一个项目，
 *  2：需要一个配置类，配置类里面需要装备好需要提供出去的类
 *  3：
 *  （1）使用@Enable，使用@Import导入需要装配的类
 *  （2）/META-INF/spring.factories，在org.springframework.boot.autoconfigure.EnableAutoConfiguration配置需要装备的类
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		
	}
}
