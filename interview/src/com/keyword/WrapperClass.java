package com.keyword;

public class WrapperClass {
	public static void main(String[] args) {
		int num=500;
		Integer in=new Integer(num);//boxing
		int a=in.valueOf(in);//unboxing
		
		Integer integer=num;//autoboxing
		int n=integer;//auto unboxing jvm
		
		String str="hello java";
		StringBuffer sf=new StringBuffer("hello java");
		StringBuilder sb=new StringBuilder("hello world");
		str.concat(" well");
		sf.append(" well");
		sb.append(" well");
		System.out.println(str);//immutable
		System.out.println(sf);//mutable
		System.out.println(sb);//mutable
	}

}
