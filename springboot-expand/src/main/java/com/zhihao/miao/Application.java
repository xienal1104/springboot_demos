package com.zhihao.miao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *   ApplicationContextInitializer �ӿ�����spring����ִ��refreshed֮ǰ��һ���ص�
 *   ʹ�ò��裺
 *   1��дһ���࣬ʵ��ApplicationContextInitializer�ӿ�
 *   2��ע��ApplicationContextInitializer
 *   
 *   ע�᷽����
 *   1��SpringApplication.addInitializers
 *   2��ͨ�������� context.initializer.classes ָ��������ָ�����������ö��Ÿ���
 *   3������ͨ��spring.factories���ƣ�ע��listener������Ҳ����ʹ�����ַ�ʽ��
 *   
 *   
 *   
 *   CommandLineRunner��ApplicationRunner �ӿ��������������ɹ�������һ���ص������ƿ�����������
 *   ʹ�ò��裺
 *   1��дһ���࣬ʵ��CommandLineRunner�ӿ�
 *   2���Ѹ������뵽spring�����Ĺ���֮��
 *   ע�⣺����ͨ��@Orderע�����Ordered�ӿ�������ִ��˳��
 *   
 *  CommandLineRunner�� ApplicationRunner ����
 *  �������ڷ����Ĳ�����һ��
 *  CommandLineRunner�Ĳ�������ԭʼ�Ĳ�����û�����κδ���
 *  ApplicationRunner�Ĳ�����ApplicationArguments���Ƕ�ԭʼ�������˽�һ���ķ�װ
 *  
 *  ApplicationArguments�ǶԲ�����main���������˽�һ���Ĵ���
 *  ���Խ���--name=value�ģ����ǾͿ���ͨ��name����ȡvalue
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
    	SpringApplication application = new SpringApplication(Application.class);
    	application.addInitializers(new MyApplicationContextInitializer());
    	ConfigurableApplicationContext context = application.run(args);
    	context.close();
	}
}
