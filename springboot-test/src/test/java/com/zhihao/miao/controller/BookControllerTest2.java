package com.zhihao.miao.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @WebMvcTest ����Ҫ������web�����£����ǣ���Ҫָ��controllers����ʾ��Ҫ������Щcontrollers
 * ���ַ�ʽֻ����controller��controller�����һЩ��������Ҫ���Լ�ȥmock
 * @WebMvcTest �����������spring����
 */
@RunWith(SpringRunner.class)
@WebMvcTest(controllers=BookController.class)
public class BookControllerTest2 {

	@Autowired
	public MockMvc mockMvc;
	
	@Test
	public void testHome() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/book/home")).andExpect(MockMvcResultMatchers.status().isOk());
		mockMvc.perform(MockMvcRequestBuilders.get("/book/home")).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string("bookhome"));
	}
	
	@Test
	public void testShow() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/book/show").param("id", "400")).andExpect(MockMvcResultMatchers.status().isOk());
		mockMvc.perform(MockMvcRequestBuilders.get("/book/show").param("id", "400")).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string("book400"));
	}
}
