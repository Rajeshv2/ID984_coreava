package com.ecception.practice;

public class A {
	void m1() {
		try {
			String str="science";
			char ch=str.charAt(10);
	
			
		}catch(StringIndexOutOfBoundsException se) {
			System.out.println("String index out of rang");
		throw se;	
		}
	}

}
