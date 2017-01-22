package com.zhihao.miao;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class EchoImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar{

	/**
	 * 可以根据AnnotationMetadata获取到注解的一些配置信息，根据BeanDefinitionRegistry来注册一些类
	 */
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,BeanDefinitionRegistry registry) {
		//首先读取注解中的packages信息
		Map<String,Object> attr = importingClassMetadata.getAnnotationAttributes(EnableEcho.class.getName());
		String[] attrs = (String[])attr.get("packages");
		List<String> packages = Arrays.asList(attrs);
		System.out.println("========packages========="+packages);
		
		//然后将EchoBeanPostProcessor注解进来，EchoBeanPostProcessor类的作用就是在每个bean初始化的时候进行一些操作，
		//当某个类是我注解信息packages中的信息时，我就做一些自己的处理
		BeanDefinitionBuilder bdb = BeanDefinitionBuilder.rootBeanDefinition(EchoBeanPostProcessor.class);
		bdb.addPropertyValue("packages", packages);
		registry.registerBeanDefinition(EchoBeanPostProcessor.class.getName(), bdb.getBeanDefinition());
	}

}
