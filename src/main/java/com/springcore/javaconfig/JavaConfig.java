package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcore.javaconfig")
public class JavaConfig {
	
	@Bean
	public Food getFood() {

		// creating new object
		return new Food();
	}

	@Bean(name= {"stu", "temp"})
	public Student getStudent() {

		// creating new object
		Student student = new Student(getFood());
		return student;
	}

}
