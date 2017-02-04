package com.zhihao.miao.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import com.google.gson.Gson;

/**
 * @SpringBootApplication 默认扫描的包的路径是当前包以及子包下面的所有类，可以通过scanBasePackages修改这个扫描包的路径
 * 
 * 排除指定的类、配置类
 * exclude 根据class来排除
 * excludeName 根据class name来排除
 * 
 * ----------------------
 * SpringApplication.setBannerMode(Banner.Mode.OFF);关闭输出banner
 * 子定义banner方法
 * 在classpath下放一个banner.txt的文件即可
 * banner.location  配置项用来指定文字banner的文件路径
 * banner.charset 配置项用来指定banner的编码，默认UTF-8
 * 
 * springboot支持图片的banner，图片格式支持jpg，png，gif
 * banner.image.location 配置项用来指定图片banner的文件路径
 * 
 * ----------------------
 * SpringApplication.setDefaultProperties(Map<String, Object> defaultProperties)
 * SpringApplication.setDefaultProperties(Properties defaultProperties)
 * 给配置项指定默认值（最先的默认值，读不到读@Value("${server.host:localhost}")或者context.getEnvironment().getProperty("server.host", "aaa")，再读不到
 * 读配置文件中的值）
 */
@SpringBootApplication(scanBasePackages="com.zhihao.miao",exclude=GsonAutoConfiguration.class)
public class Application {
    public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.setBannerMode(Banner.Mode.OFF);
		ConfigurableApplicationContext context = app.run(args);
		System.out.println(context.getBean(Runnable.class));
		System.out.println(context.getBean(Gson.class));
		context.close();
	}
}
