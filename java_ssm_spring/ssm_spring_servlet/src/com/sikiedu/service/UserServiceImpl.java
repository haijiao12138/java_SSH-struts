package com.sikiedu.service;

import com.sikiedu.bean.User;
import com.sikiedu.dao.UserDao;
import com.sikiedu.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

	private UserDao ud;
	
	
	public void setUd(UserDao ud) {
		this.ud = ud;
	}


	@Override
	public User getUserByInfo(User u) {
		return ud.getUserByInfo(u);
	}



}
