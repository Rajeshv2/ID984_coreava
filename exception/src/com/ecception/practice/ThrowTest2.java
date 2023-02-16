package com.ecception.practice;

public class ThrowTest2 {
	public static void main(String[] args) throws Exception {
		
	
	int x=20;
	int y=0;
	try {
		int z=x/y;
		System.out.println("result :"+x/y);
		throw new ArithmeticException();
	}catch(ArithmeticException ae) {

		System.out.println("arithmetic :"+ae);
	}
	}

}
