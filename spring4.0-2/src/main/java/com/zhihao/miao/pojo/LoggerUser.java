package com.zhihao.miao.pojo;

public class LoggerUser extends User{
     public void show(){
		System.out.println("log start ..");
		super.show();
		System.out.println("log end ..");
     }
}
