package com.ecception.practice;

public class Throe5 {
	public static void main(String[] args) {
		try {
			m1();
		}catch(ArithmeticException ae)
		{
			System.out.println("an exception of another"+ae);
		}
	}
	static void m1() {
		try {
			int[] a={1,2,3,4,5};
			System.out.println(a[6]);
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("array index out of range :"+aie);
			throw new ArithmeticException();
		}
	}

}
