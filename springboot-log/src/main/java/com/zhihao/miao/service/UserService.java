package com.zhihao.miao.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	private Logger log = LoggerFactory.getLogger(UserService.class);
	public void log(){
		log.debug("user service debug log");
		log.info("user service infp log");
		log.warn("user service warn log");
		log.error("user service error log");
	}
}
