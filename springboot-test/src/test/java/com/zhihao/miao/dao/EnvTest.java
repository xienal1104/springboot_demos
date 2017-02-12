package com.zhihao.miao.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.util.EnvironmentTestUtils;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *  springboot会优先加载测试环境下的配置文件（application.properties）
 *  测试环境下没有才会加载正式环境下的配置文件
 */
@RunWith(SpringRunner.class)
@SpringBootTest(properties={"app.version=1.0.0"})
public class EnvTest {
	
	@Autowired
	public ConfigurableEnvironment env;
	
	@Before
	public void init(){
		EnvironmentTestUtils.addEnvironment(env, "app.admin.name=miaozhihao");
		EnvironmentTestUtils.addEnvironment(env, "app.admin.password=123456");
	}
	
	@Test
	public void testValue(){
		Assert.assertEquals("springboottest", env.getProperty("app.name"));
		Assert.assertEquals("1.0.0", env.getProperty("app.version"));
		Assert.assertEquals("miaozhihao", env.getProperty("app.admin.name"));
		Assert.assertEquals("123456", env.getProperty("app.admin.password"));
	}
}
