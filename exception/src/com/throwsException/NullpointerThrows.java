package com.throwsException;

public class NullpointerThrows{
	public static void myMethod()throws ArithmeticException, NullPointerException{
		String s=null;
		System.out.println(10/0);
		System.out.println(s.toString());
	}
	public static void main(String[] args) {
		try {
			myMethod();	
		}catch(ArithmeticException ae) {
		System.out.println(ae.getMessage());
		
		}catch(NullPointerException ne) {
			System.out.println(ne);
		}
	}

}
