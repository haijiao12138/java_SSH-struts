package com.sikiedu.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//bean name="user" class="com.sikiedu.bean.User">
//@Controller() // ��Ӧweb��
//@Service()  // ��Ӧservice��
//@Repository() // ��Ӧdao��
@Component("user")
//@Scope(scopeName="prototype")
public class User2 {
	private Integer u_id;
	private String u_username;
	private String u_passwprd;

	// ��������ֶ�
	private Pet u_pet;

	public Pet getU_pet() {
		return u_pet;
	}

	public void setU_pet(Pet u_pet) {
		this.u_pet = u_pet;
	}

	public User2() {
		// ���췽��
		System.out.println("����user2����ղ������췽��!");
	}

	public User2(Integer u_id, String u_username, String u_passwprd) {
		super();
		this.u_id = u_id;
		this.u_username = u_username;
		this.u_passwprd = u_passwprd;
		System.out.println("����user����������������췽��!");
	}

	public Integer getU_id() {
		return u_id;
	}

	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}

	public String getU_username() {
		return u_username;
	}

	public void setU_username(String u_username) {
		this.u_username = u_username;
	}

	public String getU_passwprd() {
		return u_passwprd;
	}

	public void setU_passwprd(String u_passwprd) {
		this.u_passwprd = u_passwprd;
	}

	// �ڹ��췽������÷���
	@PostConstruct()
	public void userLnit() {
		System.out.println("user init");
	}

	//�����ٷ���ǰ����
	@PreDestroy()
	public void userDestroy() {// �����ر�ʱ����
		System.out.println("user Destory");
	}

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_username=" + u_username + ", u_passwprd=" + u_passwprd + ", u_pet=" + u_pet
				+ "]";
	}

}