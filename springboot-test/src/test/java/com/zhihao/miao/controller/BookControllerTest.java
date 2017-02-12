package com.zhihao.miao.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * TestRestTemplate 需要运行在web环境中
 * @SpringBootTest 会加载整个spring容器
 * WebEnvironment.RANDOM_PORT表示随机的端口
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class BookControllerTest {
	
	@Autowired
	public TestRestTemplate restTemplate;

	@Test
	public void testHome() {
		String context = restTemplate.getForObject("/book/home", String.class);
		Assert.assertEquals("bookhome", context);
	}
	
	@Test
	public void testShow() {
		String context = restTemplate.getForObject("/book/show?id=100", String.class);
		Assert.assertEquals("book100", context);
	}
	
	

}
