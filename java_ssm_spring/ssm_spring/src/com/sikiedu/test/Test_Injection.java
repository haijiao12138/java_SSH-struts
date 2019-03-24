package com.sikiedu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sikiedu.bean.MyCollection;
import com.sikiedu.bean.User;

public class Test_Injection {

	@Test
	public void Test2() {

		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_Injection.xml");// 创建容器

		User u1 = (User)ac.getBean("user1");// 通过类型获取,传递类的字节码对象

		System.out.println(u1);

	}
	
	//array
	@Test
	public void Test3() {

		//array
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_Injection.xml");// 创建容器

		MyCollection mc = (MyCollection)ac.getBean("collection");
		

		System.out.println(mc);

	}

	//map
	@Test
	public void Test4() {

		//array
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_Injection.xml");// 创建容器

		MyCollection mc = (MyCollection)ac.getBean("collection");
		

		System.out.println(mc);

	}

}
