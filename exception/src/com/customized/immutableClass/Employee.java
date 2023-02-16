package com.customized.immutableClass;

public final class Employee {
	private final String name;
	private final int id;
	private Address address;
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public Employee(String name, int id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	
	

}
