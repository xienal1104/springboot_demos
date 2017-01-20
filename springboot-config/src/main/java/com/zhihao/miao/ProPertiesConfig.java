package com.zhihao.miao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@PropertySource("classpath:book-config.properties")
public class ProPertiesConfig {
    
	//普通的属性赋值
	@Value("I love You")
	public String normal;
	
	//引用系统环境的变量
	@Value("@{systemProperties['os.name']}")
	private String osName;
	
	//调用jdk-api赋值
	@Value("#{ T(java.lang.Math).random() * 100.0}")
	private double randomNumber;
	
	//外部引用文件读取
	@Value("classpath:file.txt")
	private Resource file;
	
	@Value("http://www.baidu.com")
	private Resource url;
	
	//如果使用@Value进行注入bookName属性，则需要配置一个@Bean，即PropertySourcePlaceHolderConfigurer
	@Value("${book.name}")
	private String name;
	
	@Value("${book.number}")
	private String number;
	
	
	//注入PropertySourcePlaceholderConfigurer,配置器<bean></bean>
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Autowired
	private Environment environment;
	
	/**
	 * 输出信息
	 */
	public void show(){
		try{
			System.out.println("普通字符串注入："+this.normal);
			System.out.println("操作系统属性注入："+this.osName);
			System.out.println("表达式结果注入："+this.randomNumber);
			System.out.println("文件资源注入："+org.apache.commons.io.IOUtils.toString(this.file.getInputStream()));
			System.out.println("网址资源注入："+org.apache.commons.io.IOUtils.toString(this.url.getInputStream()));
			System.out.println("properties bookName:"+this.name);
			System.out.println("properties bookAuthor:"+environment.getProperty("book.author"));
			System.out.println("properties bookNumber:"+this.number);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
}
