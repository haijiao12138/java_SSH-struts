package com.sikiedu.bean;

import java.util.List;

public class UserVo extends User {
	// ������װ��
	// // ����һ���� ��ҪUser�Ķ�������,��ʱ��Ҫ��װUser
	// public User user;
	// public User getUser() {
	// return user;
	// }
	//
	// public void setUser(User u) {
	// this.user=user;
	// }
	//
	// // ��Ҫ��B��id name����
	private Country country;
	//list��������id���в�ѯ
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
