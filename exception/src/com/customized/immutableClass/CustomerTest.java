package com.customized.immutableClass;

public class CustomerTest {
	public static void main(String[] args) {
		Address d=new Address("secundrabad",515801);
		
		Customer c1=new Customer("rajesh",12001,d);
		System.out.println(c1.getName());
		System.out.println(c1);
	}

}
