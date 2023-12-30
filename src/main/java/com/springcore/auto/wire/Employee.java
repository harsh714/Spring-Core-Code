package com.springcore.auto.wire;

public class Employee {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

//	public Employee(Address address) {
//		super();
//		System.out.println("Through constructor");
//		this.address = address;
//	}

}
