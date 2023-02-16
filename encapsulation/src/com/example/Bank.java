package com.example;

public class Bank {
	
	private int id;
	private String name;
	private int pin;
	
	
	public Bank(int id, String name, int pin) {
		super();
		this.id = id;
		this.name = name;
		this.pin = pin;
	}
	private Bank() {
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", pin=" + pin + "]";
	}
	public String getDetails() {
	
		
		return toString();
		
		
	}

	
	
	
	
	
	
	
	
	
}