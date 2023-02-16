package com.ecception.practice;

public class ThrowTest {
	public static void main(String[] args) {
		try {
			//System.out.println(10/0);
			ArithmeticException a=new ArithmeticException("rajesh babu");
			throw a;
		}catch(ArithmeticException ae) {
			System.out.println("excetption ae: "+ae);
			System.out.println(ae.getMessage());
		}
	}

}
