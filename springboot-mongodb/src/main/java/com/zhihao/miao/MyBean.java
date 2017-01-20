package com.zhihao.miao;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.stereotype.Component;

import com.mongodb.DB;


/**
 * 根据官网可以自己配置一个MongoDbFactory来访问Mongodb数据库，默认情况下会使用URL：： mongodb://localhost/test 连接一个
 * MongoDB服务器。
 * @author Administrator
 *
 */
@Component
public class MyBean {
     
	private final MongoDbFactory mongodb;
	
	@Autowired
	private MyBean(MongoDbFactory mongodb){
		this.mongodb = mongodb;
	}
	
	public void example(){
		DB db = mongodb.getDb();
		Set<String> set = db.getCollectionNames();
		for(String collectionName:set){
			System.out.println(collectionName);
		}
	}
	
}
