package com.zhihao.miao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Application {
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		//services.msc
		DataSource ds = context.getBean(DataSource.class);
		System.out.println(ds);
		Connection conn = ds.getConnection();
		System.out.println(conn.getCatalog());
		conn.close();
		System.out.println(context.getBean(JdbcTemplate.class));
		context.close();
	}
}
