package com.ecception.practice;

public class B {
	public static void main(String[] args) {
		A a=new A();
		try {
			a.m1();
		}catch(StringIndexOutOfBoundsException se) {
			System.out.println("rethrowed exception :"+se);
		}
	}

}
