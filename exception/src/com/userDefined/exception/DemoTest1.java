package com.userDefined.exception;

public class DemoTest1 {
	public static void main(String[] args) {
		try {
			
			throw new Demo1("this is user defined exception");
			}
			catch(Demo1 a) {
				System.out.println("caught the exception");
				System.out.println(a.getMessage());
			}
		
	}

}
