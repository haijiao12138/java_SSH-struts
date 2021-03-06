package com.sikiedu.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cat")
public class Pet {
	//宠物类型
	private String petType;
	//宠物颜色
	private String color;
	public String getPetType() {
		return petType;
	}
	@Value("加菲猫")
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public String getColor() {
		return color;
	}
	@Value("咖啡色")
	public void setColor(String color) {
		this.color = color;
	}
	public Pet() {

	}
	public Pet(String petType, String color) {
		super();
		this.petType = petType;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Pet [petType=" + petType + ", color=" + color + "]";
	}
	
	

}
