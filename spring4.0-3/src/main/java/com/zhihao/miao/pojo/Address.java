package com.zhihao.miao.pojo;

public class Address {
	private String pro;
	private String city;

	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [pro=" + pro + ", city=" + city + "]";
	}

}
