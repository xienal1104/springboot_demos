package com.zhihao.miao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot测试步骤
 * 直接在测试类上面加上如下2个注解
 *  @RunWith(SpringRunner.class)
 *  @SpringBootTest 加入这二个接口之后那么就自动可以装配UserDao
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
