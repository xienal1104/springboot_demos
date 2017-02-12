package com.zhihao.miao.dao;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * ֻ�ڲ��Ի�������Ч
 * ���Ի����£�ֻ����@TestConfiguration��������@Configuration��@Configuration�ڲ��Ի��������ԣ�
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
