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
 * TestRestTemplate ��Ҫ������web������
 * @SpringBootTest ���������spring����
 * WebEnvironment.RANDOM_PORT��ʾ����Ķ˿�
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
