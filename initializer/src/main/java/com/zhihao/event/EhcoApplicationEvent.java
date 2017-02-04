package com.zhihao.event;

import org.springframework.context.ApplicationEvent;

/**
 * 定义事件
 *
 */
public class EhcoApplicationEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	public EhcoApplicationEvent(Object source) {
		super(source);
	}

}
