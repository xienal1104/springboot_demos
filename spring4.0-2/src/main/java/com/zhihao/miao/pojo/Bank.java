package com.zhihao.miao.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * spring4.3������
 * ��Ҫע�⣺
 * 1�����캯��ֻ����һ��������ж���Ļ����ͱ�����һ���޲εĹ��캯������ʱ��spring������޲εĹ��캯��
 * 2�����캯���Ĳ��������붼Ҫ��Spring��������
 *
 */
@Component
public class Bank {
    
	private ApplicationContext applicationContext;

	public Bank(ApplicationContext applicationContext,User user){
		this.applicationContext = applicationContext;
	}
	
	public void show(){
		System.out.println("bank : "+applicationContext.getClass());
	}
}
