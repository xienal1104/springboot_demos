package com.zhihao.miao;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * 官网的单元测试不太懂，虽然打印出结果了。org.springframework.boot.test这个模块年后也打算找个机会学习一下。
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMongodbApplicationTests {

	@ClassRule
	public static OutputCapture outputCapture = new OutputCapture();

	@Test
	public void testDefaultSettings() throws Exception {
		String output = SpringbootMongodbApplicationTests.outputCapture.toString();
		assertThat(output).contains("firstName='Alice', lastName='Smith'");
	}

}
