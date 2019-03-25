package com.sikiedu.web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.sikiedu.bean.User;
import com.sikiedu.service.UserService;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLogin")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService us;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 接收表单数据
		String username = request.getParameter("username");
		String password = request.getParameter("pssword");

		// 封装成user对象
		User u = new User();
		u.setU_username(username);
		u.setU_password(password);

		// 通过容器获取userService
//		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		us = (UserService) ac.getBean("userService");

		// 在web项目中我们只需要一个spring的容器

		// application域

		// ServletContent()生命周期 随着web项目启动而创建 随着web项目关闭而销毁

		// ServletContextListener 可以通过已经配置的监听器来达到我们的要求 在web项目创建的时候创建spring
		// 销毁时关闭spring容器
		
		WebApplicationContext wac = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		us=(UserService)wac.getBean("userService");
		// 调用service方法验证用户
		// UserService us=new UserServiceImpl();
		User loginUser = us.getUserByInfo(u);

		// 根据验证结果进行操作
		if (loginUser == null) {
			//// 验证失败 转发到login_page.jsp
			request.setAttribute("errorMsg", "用户名挥着密码错误");
			request.getRequestDispatcher("/login_page.jsp").forward(request, response);
		} else {
			// 验证成功 登录,重定向到index.jsp
			HttpSession session = request.getSession();
			session.setAttribute("user", loginUser);
			response.sendRedirect(request.getContextPath() + "/index.jsp");
		}

	}

	public UserLoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
