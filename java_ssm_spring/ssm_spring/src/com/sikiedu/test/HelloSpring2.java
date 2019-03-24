package com.sikiedu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sikiedu.bean.User;

public class HelloSpring2 {

	@Test
	public void Test2() {

		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");// 创建容器

		//scope="singleton";单例的话,只能创建一份对象 
		//scope="prototype";多例的话,创建的对象是不同的
		//
		User u1 = ac.getBean(User.class);// 通过类型获取,传递类的字节码对象
		User u2 = ac.getBean(User.class);// 通过类型获取,传递类的字节码对象
		User u3 = ac.getBean(User.class);// 通过类型获取,传递类的字节码对象
//		System.out.println(u);
		System.out.println(u1==u2);
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);

	}
	
	@Test
	public void Test3() {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");// 创建容器

		//scope="singleton";单例的话,只能创建一份对象 
		//scope="prototype";多例的话,创建的对象是不同的,获取的时候会创建新的对象
		//
		User u1 = ac.getBean(User.class);// 通过类型获取,传递类的字节码对象
		User u2 = ac.getBean(User.class);// 通过类型获取,传递类的字节码对象
		User u3 = ac.getBean(User.class);// 通过类型获取,传递类的字节码对象
		System.out.println(u1==u2);

		//关闭容器对象,会出发bean的destory的方法
		ac.close();

	}


}
