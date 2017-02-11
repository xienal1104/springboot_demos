package com.zhihao.miao.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
	
	@Autowired
	public UserDao userDao;

	@Test
	public void testAddUser() {
		Assert.assertEquals(Integer.valueOf(1), userDao.addUser("root"));
		Assert.assertEquals(Integer.valueOf(0), userDao.addUser(null));
	}

}
