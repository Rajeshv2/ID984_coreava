package com.ecception.practice;

public class Person implements Cloneable {
	//cloneable is a marker interface, there is no method
	private String name;
	public Person(String name) {
		this.name=name;
		
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	


}
