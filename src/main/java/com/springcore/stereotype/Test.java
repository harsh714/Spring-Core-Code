package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");

//		Student s1 = context.getBean("studentdata", Student.class);

//		System.out.println(s1);
//		
//		System.out.println("--------------------");
//		System.out.println(s1.getSubjects());
//		System.out.println(s1.getSubjects().getClass().getName());

//		System.out.println(s1.hashCode());

//		Student s2 = context.getBean("studentdata", Student.class);
//		System.out.println(s2.hashCode());
		
		Teacher t1 = (Teacher)context.getBean("t1");
		System.out.println(t1.hashCode());
		
		Teacher t2 = context.getBean("t1",Teacher.class);
		System.out.println(t2.hashCode());

	}

}
