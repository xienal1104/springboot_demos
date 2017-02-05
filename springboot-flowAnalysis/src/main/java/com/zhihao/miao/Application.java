package com.zhihao.miao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *  �������̣�
 *  1���ж��Ƿ���web����
 *  2����������classpath�����META-INF/spring.factories   ApplicationContextInitializer
 *  3����������classpath�����META-INF/spring.factories   ApplicationListener
 *  4���ƶ�main�������ڵ���
 *  5����ʼִ��run����
 *  6������java.awt.headlessϵͳ����
 *  7����������classpath�����META-INF/spring.factories   SpringApplicationRunListener
 *  8��ִ������SpringApplicationRunListener��started����
 *  9��ʵ����ApplicationArguments����
 *  10������environment
 *  11������environment����Ҫ�ǰ�run�����Ĳ������õ�environment
 *  12��ִ������SpringApplicationRunListener��environmentPrepared����
 *  13���������web������������web��environment��������web��environmentת���ɱ�׼��environment
 *  14����ӡBanner
 *  15����ʼ��applicationContext, �����web��������ʵ����AnnotationConfigEmbeddedWebApplicationContext���󣬷���ʵ����AnnotationConfigApplicationContext����
 *  16�����beanNameGenerator��Ϊ�գ��Ͱ�beanNameGenerator����ע�뵽context����ȥ
 *  17���ص����е�ApplicationContextInitializer����
 *  18��ִ������SpringApplicationRunListener��contextPrepared����
 *  19��������spring������ע�룺ApplicationArguments��Banner
 *  20���������е�Դ��context����ȥ
 *  21��ִ������SpringApplicationRunListener��contextLoaded����
 *  22��ִ��context��refresh���������ҵ���context��registerShutdownHook��������һ��ִ�����֮��spring��������ȫ��ʼ�����ˣ�
 *  23���ص�����ȡ���������е�ApplicationRunner��CommandLineRunner�ӿڣ�Ȼ���������ε���
 *  24��ִ������SpringApplicationRunListener��finished����
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		//ʵ����SpringApplication����Ȼ�����run����
		SpringApplication application = new SpringApplication(Application.class);
		//���Ƶ�22����ִ��
		application.setRegisterShutdownHook(false);
		ConfigurableApplicationContext context = application.run(args);
		//ֱ�ӵ��þ�̬��run�������ڲ�ת���ɵ�һ�ֵ��÷�ʽ��
		//ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		//AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		//ac.register(annotatedClasses);
		//ac.register(annotatedClasses);
		//ac.register(annotatedClasses);
		//ac.register(annotatedClasses);
		//ac.refresh();
		
		
		
		context.close();
	}
}
