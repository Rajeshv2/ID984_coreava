package com.ecception.practice;

public class PersonTest {
	public static void main(String[] args) {
		Person p=new Person("rajesh");
		try {
			p.clone();
		}catch(CloneNotSupportedException ce) {
			ce.printStackTrace();
		}
		System.out.println("continuing exception..");
	}

}
