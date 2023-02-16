package com.throwsException;

import java.io.IOException;

public class ThrowExample {
	void myMethod(int num)throws IOException,ClassCastException{
		if(num==1) {
			throw new IOException("ioe exception");
		}else
			throw new ClassCastException("classNot found exception");
	}
	public static void main(String[] args) {
		try {
			ThrowExample obj=new ThrowExample();
			obj.myMethod(12);
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
