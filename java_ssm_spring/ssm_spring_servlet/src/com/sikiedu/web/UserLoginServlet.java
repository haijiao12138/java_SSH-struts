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

		// ���ձ�����
		String username = request.getParameter("username");
		String password = request.getParameter("pssword");

		// ��װ��user����
		User u = new User();
		u.setU_username(username);
		u.setU_password(password);

		// ͨ��������ȡuserService
//		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		us = (UserService) ac.getBean("userService");

		// ��web��Ŀ������ֻ��Ҫһ��spring������

		// application��

		// ServletContent()�������� ����web��Ŀ���������� ����web��Ŀ�رն�����

		// ServletContextListener ����ͨ���Ѿ����õļ��������ﵽ���ǵ�Ҫ�� ��web��Ŀ������ʱ�򴴽�spring
		// ����ʱ�ر�spring����
		
		WebApplicationContext wac = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		us=(UserService)wac.getBean("userService");
		// ����service������֤�û�
		// UserService us=new UserServiceImpl();
		User loginUser = us.getUserByInfo(u);

		// ������֤������в���
		if (loginUser == null) {
			//// ��֤ʧ�� ת����login_page.jsp
			request.setAttribute("errorMsg", "�û��������������");
			request.getRequestDispatcher("/login_page.jsp").forward(request, response);
		} else {
			// ��֤�ɹ� ��¼,�ض���index.jsp
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
