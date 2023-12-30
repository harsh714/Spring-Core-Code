package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Food {

	private String name;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Inside food init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside food destroy");
	}

}
