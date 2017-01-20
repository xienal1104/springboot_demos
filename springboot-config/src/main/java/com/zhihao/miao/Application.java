package com.zhihao.miao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		//ConfigurableEnvironment env = applicationContext.getEnvironment();
		//System.out.println(env.getProperty("local.ip"));
		//System.out.println(env.getProperty("local.port"));
		
		//UserConfig config = applicationContext.getBean(UserConfig.class);
		//config.show();
		
		//Book book = applicationContext.getBean(Book.class);
		//book.show();
		
		//ProPertiesConfig proPertiesConfig = applicationContext.getBean(ProPertiesConfig.class);
		//proPertiesConfig.show();
		
		//DataSourceProperties dataSourceProperties = applicationContext.getBean(DataSourceProperties.class);
		//dataSourceProperties.show();
		//JdbcConfig jdbcConfig = applicationContext.getBean(JdbcConfig.class);
		//jdbcConfig.show();
		applicationContext.close();
	}
}
