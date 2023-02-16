package com.araysSorting;

public class Employee implements Comparable<Employee>{
	String name;
	int id;
	int age;
	public Employee(String name,int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Employee o) {
//		if(this.age==o.age)  
//		      return 0;  
//		   else if(this.age>o.age)  
//		      return 1;  
//		   else  
//		      return -1; 
		return this.age >o.age ? 1 : this.age <o.age ? -1 : 0;
	}
	
	

}
