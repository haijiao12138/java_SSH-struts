package com.sikiedu.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sikiedu.bean.Pet;

@RunWith(SpringJUnit4ClassRunner.class) // ʹ��unit�����ǽ��в���,�����Ǵ�������
@ContextConfiguration("classpath:applicationContext.xml") // ��ȡ�����ļ�
public class Test_Junit {

	@Resource(name="dog")
	private Pet p;
	
	@Test
	public void Test2() {
		System.out.println(p);

	}

}