package com.rajesh.localInner;

public class A {
	
	class B{
		public void m1() {
			System.out.println("inner class method");
			}
		}
	public void instanceoutMethod() {
		B c=new B();
		c.m1();
		
	}
	public static void main(String[] args) {
		System.out.println("outer class main method");
		A a=new A();
		A.B b=a.new B();
		b.m1();
		a.instanceoutMethod();
		
	}

}
