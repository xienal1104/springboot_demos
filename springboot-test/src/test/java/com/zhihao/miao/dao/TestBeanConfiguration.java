package com.zhihao.miao.dao;

import org.springframework.boot.test.context.TestConfiguration;

/**
 * 只在测试环境下有效
 * 测试环境下，只能用@TestConfiguration，不能用@Configuration
 */
@TestConfiguration
public class TestBeanConfiguration {

}
