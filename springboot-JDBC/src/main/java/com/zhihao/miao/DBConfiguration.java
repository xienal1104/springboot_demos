package com.zhihao.miao;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.alibaba.druid.pool.DruidDataSource;

@SpringBootConfiguration
public class DBConfiguration {
	
	@Autowired
	private Environment environment;
	
	@Bean
	public DataSource createDataSource(){
		DruidDataSource dds = new DruidDataSource();
		dds.setUrl(environment.getProperty("spring.datasource.url"));
		dds.setUsername(environment.getProperty("spring.datasource.username"));
		dds.setPassword(environment.getProperty("spring.datasource.password"));
		dds.setDriverClassName(environment.getProperty("spring.datasource.driver-class-name"));
		return dds;
	}
}
