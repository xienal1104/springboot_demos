package com.zhihao.miao.pojo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppContext {
	
	@Bean
	public User createUser(){
		return new User();
	}
	
	@Bean
	//@Primary
	public UserDao createUserDao(){
		return new UserDao();
	}
	
	@Bean
	public Train createTrain(){
		return new Train();
	}
	
	@Bean(initMethod="init",destroyMethod="destroy")
	public Bike createBike(){
		return new Bike();
	}
	
	@Bean
	public Bus createBus(){
		return new Bus();
	}
	
	@Bean
	public CarFactory createCarFactory(){
		return new CarFactory();
	}
	
	@Bean
	public Car createCar(CarFactory factory){
		return factory.create();
	}
	
	@Bean
	public RunnableFactoryBean createRunnableFactoryBean(){
		return new RunnableFactoryBean();
	}
    
	@Bean(name="coursee")
	@Scope("prototype")
	public Course course(){
		Course course = new Course();
		course.setModule(module());
		return course;
	}
	
	@Bean
	public Module module(){
		Module module = new Module();
		module.setAssignment(assignment());
		return module;
	}
	
	@Bean
	public Assignment assignment(){
		Assignment assignment = new Assignment();
		return assignment;
	}
	
}
