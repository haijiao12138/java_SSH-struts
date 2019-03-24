package com.sikiedu.bean;

import java.util.List;

public class UserVo extends User {
	// 创建包装类
	// // 加入一个表单 需要User的对象信心,这时需要封装User
	// public User user;
	// public User getUser() {
	// return user;
	// }
	//
	// public void setUser(User u) {
	// this.user=user;
	// }
	//
	// // 需要表B的id name属性
	private Country country;
	//list将传入多个id进行查询
	private List<Integer> idList;
	

	public List<Integer> getIdList() {
		return idList;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}

	public UserVo() {

	}

	public UserVo(Country country) {
		super();
		this.country = country;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "UserVo [country=" + country + ", getU_id()=" + getU_id() + ", getU_username()=" + getU_username()
				+ ", getU_sex()=" + getU_sex() + "]";
	}

}
