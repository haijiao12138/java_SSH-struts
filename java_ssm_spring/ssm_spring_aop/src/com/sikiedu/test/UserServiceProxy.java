package com.sikiedu.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.sikiedu.service.UserService;

/**
 * UserService������
 * 
 * @author houyuanbo
 *
 */
public class UserServiceProxy {
	// UserServiceProxy
	public UserService getUserServiceProxy(UserService us) {
		
		return (UserService)Proxy.newProxyInstance(UserServiceProxy.class.getClassLoader(), UserServiceProxy.class.getInterfaces(),new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						//��ǿ����
						System.out.println("��������");
						//���� ԭʼ����
						Object invoke = method.invoke(us, args);
						System.out.println("�ύ/�ع�");
						return invoke;
					}
				});
	}

}
