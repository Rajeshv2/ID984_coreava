package com.customized.immutableClass;

public class Customer implements Cloneable {
	private final String name;
	private final int id;
	private Address address;
	
	public Customer(String name, int id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public Address getAddress() {
		return address;
	}
	public Address getAddress1() throws CloneNotSupportedException{
		return (Address)clone();
	}
	
	
}
