package com.sikiedu.bean;

import java.util.List;

public class CountryVo extends Country{
	//��Ҫά��һ��user����,
	private List<User> userList;
	

	@Override
	public String toString() {
		return super.toString() + "userList="+userList;
	}

	public CountryVo(List<User> userList) {
		super();
		this.userList = userList;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}


}
