package com.throwsException;

import com.ecception.practice.Demo;

public class NullpointerEx {
	public void mymethod() {
	int a=10;
	int b=0;
		try {
			String x=null;
	//	System.out.println(a/b);
		System.out.println(x);
		
	}catch(ArithmeticException ae) {
		System.out.println(ae);
	}catch(NullPointerException ne) {
		System.out.println(ne);
	}
	}
	public static void main(String[] args) {
		NullpointerEx d= new NullpointerEx();
		d.mymethod();
	}


}
