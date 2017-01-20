package com.zhihao.miao.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;


/**
 * BeanFactoryPostProcessor��Spring������ʼ��֮�󴥷�������ֻ�ᴥ��һ�Ρ�
 * ������ʱ����BeanPostProcessor��
 * @author Administrator
 *
 */
//@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("==============="+beanFactory.getBeanDefinitionCount());
	}

}
