package com.zhihao.miao.pojo;

import org.springframework.beans.factory.FactoryBean;

public class RunnableFactoryBean implements FactoryBean<Jeep> {
    
	//ʵ��FactoryBeanʵ��Ҫ���صĶ���
	@Override
	public Jeep getObject() throws Exception {
		return new Jeep();
	}

	@Override
	public Class<?> getObjectType() {
		return Jeep.class;
	}
    
	//�������Ƿ��ǵ���
	@Override
	public boolean isSingleton() {
		return false;
	}

}
