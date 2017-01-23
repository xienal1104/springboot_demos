package com.zhihao.miao;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {

	public void onApplicationEvent(MyApplicationEvent event) {
		System.out.println("接收到事件："+event.getClass());
	}

}
