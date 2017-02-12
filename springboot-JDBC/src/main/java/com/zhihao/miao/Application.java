package com.zhihao.miao;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Application {
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		//services.msc
		DataSource ds = context.getBean(DataSource.class);
		//org.apache.tomcat.jdbc.pool.DataSource,默认的是tomcat数据源
		System.out.println(ds.getClass().getName());
		//Connection conn = ds.getConnection();
		//System.out.println(conn.getCatalog());
		//conn.close();
		
		//context.getBean(ProductDao.class).addproduct("mobile");
		//System.out.println(context.getBean(JdbcTemplate.class));
		
		//context.getBean(ProductDao.class).addProductBatch(new String[]{"daopian","cup","card"});
//		context.getBean(ProductDao.class).addProductBatch(new String[]{"shouji","miaozhihao","maojin"});
//		context.close();
	}
}
