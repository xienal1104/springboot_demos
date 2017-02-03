package com.zhihao.miao;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class ServerSuccessReport implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("===========应用已经成功的启动==========" + Arrays.asList(args));
	}

}
