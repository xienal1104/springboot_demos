package com.zhihao.miao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.websocket.WebSocketAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import com.zhihao.miao.dao.UserDao;

/**
 *  springbootĬ�ϵ���־������info
 *  ����ͨ��logging.level.*=debug �����ã� * �����ǰ���Ҳ������ĳ����
 *  
 *  ��־�����У�TRACE, DEBUG, INFO, WARN, ERROR, FATAL, OFF
 *  ��־�������ó�OFF����ʾ�ر���־���
 *  
 *  logging.file ָ����־�ļ�����
 *  logging.path ָ����־Ŀ¼����ʱ����־����Ϊspring.log��
 *  ��־�ļ�������ļ��Ĵ�С10M֮�󣬾ͻ�ָ���
 *  
 *  logging.pattern.console ���ÿ���̨�����־��pattern
 *  logging.file.console ������־�ļ������־��pattern
 *  
 *  springbootĬ��֧��logback
 *  Ҳ����˵��ֻ��Ҫ��classptah�·�һ��logback.xml,logback-spring.xml(�ٷ��Ƽ�ʹ��logback-spring.xml�����ļ������ɶ�����־�����
 *  
 *  ʹ����������־����Ĳ���
 *  1���ų���Ĭ�ϵ���־�����spring-boot-starter-logging
 *  2�������µ���־·������
 *  3������Ӧ�������ļ��ŵ�classpath��
 */
@SpringBootApplication(exclude=WebSocketAutoConfiguration.class)
public class Application {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Application.class);
		//ConfigurableApplicationContext context = application.run("--debug");
		ConfigurableApplicationContext context = application.run(args);
		context.getBean(UserDao.class).log();
		context.close();
	}
}
