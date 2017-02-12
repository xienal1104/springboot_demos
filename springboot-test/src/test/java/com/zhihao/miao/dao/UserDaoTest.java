package com.zhihao.miao.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
	
	@Autowired
	private UserDao userDao;

	@Test
	public void test() {
		Assert.assertEquals(Integer.valueOf(1), userDao.addUser("admin"));
		Assert.assertEquals(Integer.valueOf(0), userDao.addUser(null));
	}

}
