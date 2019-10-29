package cn.itlu.ssm.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itlu.ssm.po.User;

public class UserDaoImplTest {
	private ApplicationContext applicationContext;

	//��setUp��������õ�spring����
	@Before
	public void setUp() throws Exception{
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		
	}

	@Test
	public void testFindUserById() throws Exception {
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		//����userDao�ķ���
		User user = userDao.findUserById(1);
		System.out.println(user);
	}

}
