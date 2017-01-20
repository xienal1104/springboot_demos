package com.zhihao.miao.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * BeanPostProcessor����ÿ��bean��ʼ����ʱ�򣬵���һ��
 * �����������ܷ���null�����򣬴������оͻ�ȡ����
 *
 */
//@Component
public class EchoBeanPostProcessor implements BeanPostProcessor {
	
	/**
	 * ����bean����װ�䣨���������꣩���֮�󴥷�
	 * ������Զ�ָ����bean��һЩ��������˵�����ö���Ĵ������
	 */
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("=========postProcessBeforeInitialization=========" + bean.getClass());
		if(bean instanceof User){
			return new LoggerUser();
		}
		return bean;
	}

	/**
	 * ����bean init����ִ��֮�󴥷���
	 */
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("=========postProcessAfterInitialization=========" + bean.getClass());
		return bean;
	}

}
