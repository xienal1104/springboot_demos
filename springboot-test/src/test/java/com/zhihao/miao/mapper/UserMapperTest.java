package com.zhihao.miao.mapper;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.internal.matchers.Null;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class UserMapperTest {
	
	//ʹ��MockBean����Ϊ��ʱ������û��UserMapper�������
	@MockBean
	public UserMapper userMapper;
	
	//ʹ��BDDMockito����Ϊ����Ԥ�⣬
	@Before
	public void init(){
		BDDMockito.given(userMapper.createUser("admin")).willReturn(1);
		BDDMockito.given(userMapper.createUser("")).willReturn(0);
		BDDMockito.given(userMapper.createUser(null)).willThrow(NullPointerException.class);
	}

	@Test(expected=NullPointerException.class)
	public void testCreateUser() {
		Assert.assertEquals(Integer.valueOf(1),userMapper.createUser("admin")) ;
		Assert.assertEquals(Integer.valueOf(0),userMapper.createUser("")) ;
		Assert.assertEquals(Integer.valueOf(1),userMapper.createUser(null)) ;
	}

}
