package com.springcore.constinj;

import java.util.List;

public class Person {
	private String pName;
	private int pId;
	private Certi certi;
	private List<String> li;

	public Person(String name, int id, Certi c, List<String> li) {
		this.pName = name;
		this.pId = id;
		this.certi = c;
		this.li = li;
	}

	@Override
	public String toString() {
		return "Person [pName=" + pName + ", pId=" + pId + ", certi=" + certi + ", li=" + li + "]";
	}

}
