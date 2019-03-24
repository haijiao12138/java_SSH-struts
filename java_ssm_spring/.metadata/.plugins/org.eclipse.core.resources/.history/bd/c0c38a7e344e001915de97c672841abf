package com.sikiedu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sikiedu.bean.User2;

public class Test_Annotation {

	@Test
	public void Test2() {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_annotation.xml");// ´´½¨ÈÝÆ÷

		User2 u2 = (User2)ac.getBean("user");
		User2 u3 = (User2)ac.getBean("user");

		System.out.println(u2==u3);
		ac.close();

	}
	

}
