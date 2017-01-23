package com.zhihao.miao;

import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandle {
	
	
	/**
	 * 参数任意(为Object）的时候所有事件都会监听到
	 * 所有，该参数事件，或者其子事件（子类）都可以接收到
	 */
	@EventListener
	public void event(Object event){
		System.out.println("MyEventHandle 接收到事件：" + event.getClass());
	}
	
	/**
	 * 监听spring的事件（运用停止事件,Application.stop()方法时候监听到。
	 *
	*/
	@EventListener
	public void eventStop(ContextStoppedEvent event){
		System.out.println("应用停止事件==========："+event.getClass());
	}
	
}
