package com.zhihao.event;

import org.springframework.context.ApplicationListener;

public class EhcoApplicationListener implements ApplicationListener<EhcoApplicationEvent> {
	@Override
	public void onApplicationEvent(EhcoApplicationEvent event) {
		System.out.println("接收到事件EhcoApplicationListener============="+event.getSource());
	}

}
