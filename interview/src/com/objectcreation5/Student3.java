package com.objectcreation5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Student3 {
	private String college="Gates institute of technology";
	private String name="Babu";
	public Student3() {
		
	}
//	public Student3(String college,String name) {
//		this.college=college;
//		this.name=name;
//	}
	
	public String getCollege() {
		return college;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		try {
			 Constructor< Student3>constructor;
			constructor=Student3.class.getConstructor();
			Student3 std=constructor.newInstance();
			
			System.out.println(std.getName());
			System.out.println(std.getCollege());
		} catch (NoSuchMethodException e) {

			e.printStackTrace();
		} catch (SecurityException e) {
		
			e.printStackTrace();
		}
	}
}
