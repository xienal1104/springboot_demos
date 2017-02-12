package com.zhihao.miao.dao;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * 只在测试环境下有效
 * 测试环境下，只能用@TestConfiguration，不能用@Configuration（@Configuration在测试环境被忽略）
 */
@TestConfiguration
public class TestBeanConfiguration {

	@Bean
	public Runnable createRunnable(){
		return new Runnable() {
			public void run() {
				System.out.println("====runnable==========");
			}
		};
	}
}
