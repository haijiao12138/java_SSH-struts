package com.sikiedu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sikiedu.bean.User;

public class HelloSpring {
	// ��֮ǰ��Ŀ������new�����������Լ�����
	@Test
	public void Test1() {
		User u = new User();
		u.setU_id(1);
		System.out.println(u);

	}

	//IOC�ķ�ת:�����������ݹ����������Լ�ִ��ת��Spring��������ִ��
	//IOC�Ŀ���:������spring�����Ǹ��𴴽����ٶ���,�ƿض�����������ڵ�,��������Ҫʹ�ö����ʱ����spring���뼴��
	//IOC��һ�ֱ��˼��,Ҳ��һ���µ����ģʽ;����ҪDI(����ע��)������֧��
	// Spring ��һ������ ,�������ǹ�������
	
	//DI:����ע��:ͨ�����ñ��ķ�ʽΪ������ʼ��ע��/��ֵ
	@Test
	public void Test2() {
		// Ҫ���������Ҫ���úõĶ���,����Ҫ�����������
		// ����spring�����ļ���ȡ��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		// ͨ�����ֻ�ȡ����
		// Object u=(User)ac.getBean("user");//ͨ����������ȡ,���ļ���name������
		// ͨ�^getbean�@ȡ���úõ�user���󣬳���Ա������Ҫ����
		User u = ac.getBean(User.class);// ͨ�����ͻ�ȡ,��������ֽ������
		System.out.println(u);

	}

}