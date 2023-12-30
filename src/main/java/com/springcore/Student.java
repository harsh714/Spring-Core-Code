package com.springcore;

public class Student {
	private int id;
	private String name;
	private String address;
	
	public void setId(int id) {
		System.out.println("Setting student id");
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	

	public void setName(String name) {
		System.out.println("Setting student name");
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		System.out.println("Setting student  address");
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	//constructor

	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
