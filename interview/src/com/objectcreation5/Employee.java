package com.objectcreation5;

import java.io.Serializable;

public class Employee implements Serializable,Cloneable{
	String name;
	double salary;
	
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		//by using object cloning-clone() method
		 Employee emp= new Employee("Ramesh",24510.25);
	        try {
	            Employee emp2=(Employee) emp.clone();
	            System.out.println(emp2.getName());
	            System.out.println(emp2.getSalary());
	            
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
	}
}
