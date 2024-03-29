package com.sikiedu.bean;

public class User {
	private Integer u_id;
	private String u_username;
	private String u_passwprd;
	
	
	//带参构造
	public User(String u_username, Pet u_pet) {
		System.out.println("方法1:String,pet");
		this.u_username = u_username;
		this.u_pet = u_pet;
	}
	
	//带参构造
		public User(Integer u_username, Pet u_pet) {
			System.out.println("方法2:Integer,pet");
			this.u_username = u_username.toString();
			this.u_pet = u_pet;
		}
		
		//带参构造
		public User(Pet u_pet,Integer u_username) {
			System.out.println("方法3:,pet,Integer");
			this.u_username = u_username.toString();
			this.u_pet = u_pet;
		}

	// 加入宠物字段
	private Pet u_pet;

	public Pet getU_pet() {
		return u_pet;
	}

	public void setU_pet(Pet u_pet) {
		this.u_pet = u_pet;
	}

	public User() {
		// 构造方法
		System.out.println("这是user对象空参数构造方法!");
	}

	public User(Integer u_id, String u_username, String u_passwprd) {
		super();
		this.u_id = u_id;
		this.u_username = u_username;
		this.u_passwprd = u_passwprd;
		System.out.println("这是user对象带参数参数构造方法!");
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

	// 初始化方法
	public void userLnit() {
		System.out.println("user init");
	}

	public void userDestroy() {// 容器关闭时激活
		System.out.println("user Destory");
	}

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_username=" + u_username + ", u_passwprd=" + u_passwprd + ", u_pet=" + u_pet
				+ "]";
	}

}
