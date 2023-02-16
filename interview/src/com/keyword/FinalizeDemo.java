package com.keyword;

public class FinalizeDemo {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("object");
		super.finalize();
		
	}
	public static void main(String[] args) {
		FinalizeDemo f=new FinalizeDemo();
		f=null;
		f=null;
		System.gc();
	}

}
