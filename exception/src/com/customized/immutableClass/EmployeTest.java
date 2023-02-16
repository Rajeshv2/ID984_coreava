package com.customized.immutableClass;

public class EmployeTest {
	public static void main(String[] args) {
		Address d=new Address("hyderabad",515801);
		Employee e=new Employee("rajesh",101,d);
		
		System.out.println(e.getId());
		System.out.println(e);
//		e.name="madhu";
	
	}

}

