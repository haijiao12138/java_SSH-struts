package com.sikiedu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sikiedu.bean.User;

public class HelloSpring2 {

	@Test
	public void Test2() {

		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");// ��������

		//scope="singleton";�����Ļ�,ֻ�ܴ���һ�ݶ��� 
		//scope="prototype";�����Ļ�,�����Ķ����ǲ�ͬ��
		//
		User u1 = ac.getBean(User.class);// ͨ�����ͻ�ȡ,��������ֽ������
		User u2 = ac.getBean(User.class);// ͨ�����ͻ�ȡ,��������ֽ������
		User u3 = ac.getBean(User.class);// ͨ�����ͻ�ȡ,��������ֽ������
//		System.out.println(u);
		System.out.println(u1==u2);
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);

	}
	
	@Test
	public void Test3() {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");// ��������

		//scope="singleton";�����Ļ�,ֻ�ܴ���һ�ݶ��� 
		//scope="prototype";�����Ļ�,�����Ķ����ǲ�ͬ��,��ȡ��ʱ��ᴴ���µĶ���
		//
		User u1 = ac.getBean(User.class);// ͨ�����ͻ�ȡ,��������ֽ������
		User u2 = ac.getBean(User.class);// ͨ�����ͻ�ȡ,��������ֽ������
		User u3 = ac.getBean(User.class);// ͨ�����ͻ�ȡ,��������ֽ������
		System.out.println(u1==u2);

		//�ر���������,�����bean��destory�ķ���
		ac.close();

	}


}