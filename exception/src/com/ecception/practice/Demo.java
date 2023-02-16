package com.ecception.practice;

public class Demo {
	public static void main(String[] args) {
		int num=1;
		for(num=1;num<=10;num++) {
			try {
				if(num==5)
					throw new ArithmeticException("ArithmeticException");
				else if(num<2)
					throw new RuntimeException("NullPointerException");
				else if(num>9)
					throw new NullPointerException("RuntimeException");
			}
				catch(Exception e) {
					System.out.println("caught an exception");
					System.out.println(e.getMessage());
				}
			}
		}
}
