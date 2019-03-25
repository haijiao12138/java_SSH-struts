package com.sikiedu.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * �Զ���֪ͨ��
 * @author houyuanbo
 *
 */
public class MyAdvice {
	
	//afterǰ��֪ͨ ��Ŀ�귽��ǰ����
	public void before() {
		System.out.println("before");
	}
	
	//after ����֪ͨ (����֪ͨ) ��Ŀ�귽������� �����Ƿ�����쳣����ִ��finally
	public void after() {
		System.out.println("after");
	}
	
	//afterReturning�ɹ�֪ͨ(����֪ͨ) ��Ŀ�귽��ִ�к� ����ִ�г¹� ������������쳣�򲻵���
	public void afterReturning() {
		System.out.println("afterReturning");
	}
	//afterThrowing �쳣֪ͨ(����֪ͨ) ��Ŀ�귽��ִ�г����쳣��ʱ��Ż����
	public void afterThrowing() {
		System.out.println("afterThrowing");
	}
	//around ����֪ͨ
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around before");
		Object proceed = pjp.proceed();
		System.out.println("around after");
		return proceed;
	}
}
