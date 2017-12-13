package com.yuan.www.model;

import java.io.Serializable;
import java.util.Date;

public class Teacher implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String name;

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", password="
				+ password + ", position=" + position + ", loginTime="
				+ loginTime + ", tel=" + tel + ", sex=" + sex + ", avater="
				+ avater + ", nationality=" + nationality + ", height="
				+ height + ", weight=" + weight + ", school=" + school + "]";
	}

	private String password;

	private String position;

	private Date loginTime;

	private String tel;

	private String sex;

	private String avater;

	private String nationality;

	private Integer height;

	private Double weight;

	
	private String school;

	
	public Integer getId() {
		return id;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getPassword() {
		return password;
	}

	
	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getPosition() {
		return position;
	}

	
	public void setPosition(String position) {
		this.position = position;
	}

	
	public Date getLoginTime() {
		return loginTime;
	}

	
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	
	public String getTel() {
		return tel;
	}

	
	public void setTel(String tel) {
		this.tel = tel;
	}

	
	public String getSex() {
		return sex;
	}

	
	public void setSex(String sex) {
		this.sex = sex;
	}

	
	public String getAvater() {
		return avater;
	}

	
	public void setAvater(String avater) {
		this.avater = avater;
	}

	
	public String getNationality() {
		return nationality;
	}

	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	
	public Integer getHeight() {
		return height;
	}

	
	public void setHeight(Integer height) {
		this.height = height;
	}

	
	public Double getWeight() {
		return weight;
	}

	
	public void setWeight(Double weight) {
		this.weight = weight;
	}

	
	public String getSchool() {
		return school;
	}

	
	public void setSchool(String school) {
		this.school = school;
	}
}