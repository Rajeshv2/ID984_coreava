package com.ecception.practice;

import javax.management.RuntimeErrorException;

public class ThrowTest3 {
	public static void main(String[] args) {
		int num=1;
		for(num=1;num<=11;num++) {
		try {
			if(num==5)
				throw new ArithmeticException("arithmetic exception");
			else if(num<2) 
				throw new RuntimeException("runtime exception");
			
			else if(num>10)
				throw new NullPointerException("number is greater than 10");
		}catch(Exception e) {
			//System.out.println("exception :"+e);
			 System.out.println(e.getMessage());
	
		}
		}
	}

}
