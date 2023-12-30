package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {

	private Food samosa;
	

	public Food getSamosa() {
		return samosa;
	}


	public void setSamosa(Food samosa) {
		this.samosa = samosa;
	}


	public Student(Food samosa) {
		super();
		this.samosa = samosa;
	}


	public void study() {
		this.samosa.display();
		System.out.println("Student is reading");
	}

}
