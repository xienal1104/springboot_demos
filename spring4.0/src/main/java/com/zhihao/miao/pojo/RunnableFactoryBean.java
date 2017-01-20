package com.zhihao.miao.pojo;

import org.springframework.beans.factory.FactoryBean;

public class RunnableFactoryBean implements FactoryBean<Jeep> {
    
	//实现FactoryBean实际要返回的对象
	@Override
	public Jeep getObject() throws Exception {
		return new Jeep();
	}

	@Override
	public Class<?> getObjectType() {
		return Jeep.class;
	}
    
	//作用域是否是单列
	@Override
	public boolean isSingleton() {
		return false;
	}

}
