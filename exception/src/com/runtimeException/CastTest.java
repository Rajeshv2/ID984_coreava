package com.runtimeException;

public class CastTest extends ClassCastEx{
	CastTest(){
		System.out.println("hello java");
	}
	public static void main(String[] args) {
		ClassCastEx a=new ClassCastEx();
		CastTest b=new CastTest();
		
		ClassCastEx xx=(ClassCastEx)b;
		
	}

}
