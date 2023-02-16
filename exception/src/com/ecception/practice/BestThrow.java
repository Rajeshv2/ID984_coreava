package com.ecception.practice;

public class BestThrow {
	public static  void avg() {
		try {
			throw new ArithmeticException();
		}catch(ArithmeticException e) {
			 System.out.println("exception "+e);
		}
	}
	public static void main(String[] args) {
		avg();
	}


}
