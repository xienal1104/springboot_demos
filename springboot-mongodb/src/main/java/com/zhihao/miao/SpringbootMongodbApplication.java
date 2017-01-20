package com.zhihao.miao;

import static org.springframework.data.mongodb.core.query.Criteria.where;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

@SpringBootApplication
public class SpringbootMongodbApplication implements CommandLineRunner {
	
	@Autowired
	private CustomerRepository repository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private MongoTemplate  mongoTemplate;
	
	//@Autowired
	//private MyBean mybean;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		List<UserAuth> userAuthList = mongoTemplate.findAll(UserAuth.class);
		for(UserAuth userAuth:userAuthList){
			System.out.println(userAuth);
		}
		*/
		
		//mybean.example();
		
		//this.repository.deleteAll();

		// save a couple of customers
		//this.repository.save(new Customer("Alice", "Smith"));
		//this.repository.save(new Customer("Bob", "Smith"));
		//this.repository.save(new Customer("Drivd", "Yao"));
		//this.repository.save(new Customer("Brid", "Miao"));
		//this.repository.save(new Customer("John", "Lthj"));
		//this.repository.save(new Customer("Lucy", "Yao"));

		// fetch all customers(查询所有的记录）
		//System.out.println("Customers found with findAll():");
		//System.out.println("-------------------------------");
		//for (Customer customer : this.repository.findAll()) {
			//System.out.println(customer);
		//}
		//System.out.println();

		// fetch an individual customer（根据FirstName进行查询）
		//System.out.println("Customer found with findByFirstName('Alice'):");
		//System.out.println("--------------------------------");
		//System.out.println(this.repository.findByFirstName("Alice"));
        
		//根据lastName进行查询，得到一个List
		//System.out.println("Customers found with findByLastName('Smith'):");
		//System.out.println("--------------------------------");
		//for (Customer customer : this.repository.findByLastName("Smith")) {
			//System.out.println(customer);
		//}
		
		//jpa提供的delete对象报错，报缺少id，应该跟不同的数据库实现不一样，mongodb不能这样进行删除
		//this.repository.delete(new Customer("Bob", "Smith"));
		//根据id进行删除
		//this.repository.delete("587c6579442d230a04d87c1d");
		//删除所有
		//this.repository.deleteAll();
		//System.out.println("--------------------------------");
		//for (Customer customer : this.repository.findAll()) {
			//System.out.println(customer);
		//}
		
		
		//复杂查询
		//this.studentRepository.save(new Student(1,"miaozhihao","1",27));
		//this.studentRepository.save(new Student(2,"zhouliangxin","0",28));
		//this.studentRepository.save(new Student(3,"zhouyida","1",27));
		//this.studentRepository.save(new Student(4,"panjiahao","0",29));
		
		Query query = new Query(where("age").is(27));
		List<Student> stuList = mongoTemplate.find(query, Student.class);
		for(Student student:stuList){
			System.out.println(student);
		}
	}
	
	

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodbApplication.class, args);
	}
}
