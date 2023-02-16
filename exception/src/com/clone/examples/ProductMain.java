package com.clone.examples;

public class ProductMain {
	 public static void main(String[]args) throws CloneNotSupportedException {
		 Product p1=new Product();
		 p1.id=100;
		 p1.name="raju";
		 p1.t.x=1;
		 p1.t.y=2;
		 Product p3=(Product) p1.clone();
		 System.out.println(p1);
		 System.out.println(p3);
		 p3.t.x=600;
		 p3.name="hari";
		 System.out.println(p3);
		 
		 System.out.println(p1.id+" "+p1.name+" "+p1.t.x);
		 System.out.println(p3.id+" "+p3.t.x+" "+p3.name);
		
	}

}
