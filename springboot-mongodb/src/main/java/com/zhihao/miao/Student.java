package com.zhihao.miao;

import org.springframework.data.annotation.Id;

public class Student {
	
	@Id
	private String id;
	
	private int sn;
	
	private String name;
	
	private String sex;
	
	private int age;
	
	public Student(int sn,String name,String sex,int age){
		this.sn = sn;
		this.name = name;
		this.sex =sex;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSn() {
		return sn;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sn=" + sn + ", name=" + name + ", sex=" + sex + "]";
	}
}
