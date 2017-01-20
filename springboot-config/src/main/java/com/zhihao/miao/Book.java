package com.zhihao.miao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * 意思就是读的是book-config.yml中前缀是book的属性
 *
 */
@Component
@ConfigurationProperties(prefix = "book", locations = { "classpath:book-config.yml" })
public class Book {

	private String name;
	private String author;
	private Integer number;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public void show(){
		System.out.println("......................");
		System.out.println("yml bookName:"+this.name);
		System.out.println("yml bookAuthor:"+this.author);
		System.out.println("yml bookNumber:"+this.number);
	}

}
