package com.zhihao.miao.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * BeanDefinitionRegistryPostProcessor�����õ�ConfigurableListableBeanFactory��BeanDefinitionRegistry��������
 * BeanDefinitionRegistry������Զ�̬��ע��bean
 *
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		for(int i = 0;i<=10;i++){
			BeanDefinitionBuilder buider = BeanDefinitionBuilder.rootBeanDefinition(Address.class);
			buider.addPropertyValue("pro", "����"+i);
			buider.addPropertyValue("city", "����"+i);
			registry.registerBeanDefinition("address"+i,buider.getBeanDefinition());
			BeanDefinitionBuilder bdb = BeanDefinitionBuilder.rootBeanDefinition(Person.class);
			bdb.addPropertyValue("name", "admin"+i);
			bdb.addPropertyReference("address", "address"+i);
			registry.registerBeanDefinition("person"+i,bdb.getBeanDefinition());
		}
	}

}
