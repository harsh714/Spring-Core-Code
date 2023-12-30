package com.springcore.constinj;

public class Certi {
	private String cName;
	
	public Certi(String name) {
		this.cName = name;
	}

	@Override
	public String toString() {
		return "Certi [cName=" + cName + "]";
	}
	
//	@Override
//	public String toString() {
//		return this.cName;
//	}
	
}
