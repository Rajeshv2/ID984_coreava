package com.objectcreation5;

public class Student {
	//using newInstance() method class class
	String clg="Nagarjunna university hyd";
	String name="Rajesh";
	
	public Student() {
		
	}

	public Student(String clg, String name) {
		super();
		this.clg = clg;
		this.name = name;
	}

	public String getClg() {
		return clg;
	}

	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		String className="com.objectcreation5.Student";
		try {
			Class clasz = Class.forName(className);
			Student students=(Student) clasz.newInstance();
			System.out.println(students.getName());
			System.out.println(students.getClg());
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
	
			e.printStackTrace();
		}
	}
	

}
