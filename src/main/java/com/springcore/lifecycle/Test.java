package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/lifecycleconfig.xml");

		Item it = (Item) context.getBean("i1");
		System.out.println(it);
		
		System.out.println("---------------------");

		Drinks drink = (Drinks) context.getBean("d1");
		System.out.println(drink);
		
		System.out.println("---------------------");
		
		Food foo = (Food) context.getBean("f1");
		System.out.println(foo);

		// registering shutdownhook
		context.registerShutdownHook();

	}

}
