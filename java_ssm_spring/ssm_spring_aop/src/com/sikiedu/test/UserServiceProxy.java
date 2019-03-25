package com.sikiedu.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.sikiedu.service.UserService;

/**
 * UserService代理类
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
						//增强代码
						System.out.println("开启事物");
						//调用 原始方法
						Object invoke = method.invoke(us, args);
						System.out.println("提交/回滚");
						return invoke;
					}
				});
	}

}
