package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autowireconfig.xml");

		Employee emp = context.getBean("emp1", Employee.class);
		System.out.println(emp.getAddress());
	}

}
