package com.zhihao.miao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.websocket.WebSocketAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(exclude=WebSocketAutoConfiguration.class)
@PropertySource(value="classpath:my.properties")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
