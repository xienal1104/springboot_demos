package com.zhihao.miao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 通过启动参数来控制生效的profile,可以同时激活多个profile
 * --spring.profiles.active=test,dev
 * --spring.profiles=test，激活一个profile，默认的不激活（不影响配置文件）
 * @author hadoop
 *
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println(context.getBeansOfType(Runnable.class));
		//System.out.println(context.getEnvironment().getProperty("jdbc.root.user"));
		//System.out.println(context.getEnvironment().getProperty("jdbc.root.password"));
		//TomcatProperties tomcatProperties = context.getBean(TomcatProperties.class);
		//tomcatProperties.show();
		
		//编程的方式指定生效的profile
		//SpringApplication app = new SpringApplication(Application.class);
		//不指定就为默认会读取application.properties或者application-default.properties文件中的配置。
		//app.setAdditionalProfiles("dev");
		//app.setAdditionalProfiles("test");
		//也可以指定多个文件
		//app.setAdditionalProfiles("dev","test");
		//ConfigurableApplicationContext context = app.run(args);
		//System.out.println(context.getEnvironment().getProperty("jdbc.url"));
		//System.out.println(context.getEnvironment().getProperty("jdbc.username"));
		//System.out.println(context.getEnvironment().getProperty("jdbc.password"));
		context.close();
	}
}
