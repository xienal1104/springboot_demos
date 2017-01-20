package com.zhihao.miao.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


@Component
public interface SpringContextAware {
	public void setApplicationContext(ApplicationContext applicationContext);
}
