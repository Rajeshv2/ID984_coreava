package com.clone.examples;

public class Product implements Cloneable{
	int id;
	String name;
	TestP t=new TestP();
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Product p=(Product) super.clone();
		p.t=new TestP();
		return super.clone();
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", t=" + t + "]";
	}
	
	
	

}
