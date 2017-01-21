package com.zhihao.miao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;

import com.zhihao.core.Role;
import com.zhihao.core.User;

/**
 *  @EnableAutoConfiguration ���ã���classpath����������META-INF/spring.factories�����ļ�
 *  Ȼ�󣬽�����org.springframework.boot.autoconfigure.EnableAutoConfiguration key��Ӧ����������ص�spring����
 *  
 *  ֻ��spring.boot.enableautoconfigurationΪtrue��Ĭ��Ϊtrue����ʱ�򣬲������Զ�����
 *  @EnableAutoConfiguration�����Խ����ų����ų���ʽ��2�У�һ�Ǹ���class���ų���exclude�������Ǹ���class name��excludeName�����ų�
 *  
 *  ���ڲ�ʵ�ֵĹؼ�����
 *  1��ImportSelector �ýӿڵķ����ķ���ֵ���ᱻ���뵽spring����������
 *  2��SpringFactoriesLoader ������Դ�classpath����������META-INF/spring.factories�����ļ�������ȡ����
 *  
 *  
 */
@EnableAutoConfiguration
@ComponentScan
public class Application {
    public static void main(String[] args) {
    	ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
    	System.out.println(context.getBean("createRunnable"));
    	System.out.println(context.getBean(User.class));
    	System.out.println(context.getBean(Role.class));
    	context.close();
	}
}
