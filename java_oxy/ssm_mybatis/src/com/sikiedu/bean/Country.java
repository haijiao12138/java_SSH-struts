package com.sikiedu.bean;

public class Country {

	private Integer id;
	private String c_countryname;
	private String c_captial;

	public Country() {
		// 构造方法
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getC_countryname() {
		return c_countryname;
	}

	public void setC_countryname(String c_countryname) {
		this.c_countryname = c_countryname;
	}

	public String getC_captial() {
		return c_captial;
	}

	public void setC_captial(String c_captial) {
		this.c_captial = c_captial;
	}

	public Country(Integer id, String c_countryname, String c_captial) {
		super();
		this.id = id;
		this.c_countryname = c_countryname;
		this.c_captial = c_captial;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", c_countryname=" + c_countryname + ", c_captial=" + c_captial + "]";
	}
	
	

}
