package com.sikiedu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sikiedu.bean.MyCollection;
import com.sikiedu.bean.User;

public class Test_Injection {

	@Test
	public void Test2() {

		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_Injection.xml");// ��������

		User u1 = (User)ac.getBean("user1");// ͨ�����ͻ�ȡ,��������ֽ������

		System.out.println(u1);

	}
	
	//array
	@Test
	public void Test3() {

		//array
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_Injection.xml");// ��������

		MyCollection mc = (MyCollection)ac.getBean("collection");
		

		System.out.println(mc);

	}

	//map
	@Test
	public void Test4() {

		//array
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_Injection.xml");// ��������

		MyCollection mc = (MyCollection)ac.getBean("collection");
		

		System.out.println(mc);

	}

}