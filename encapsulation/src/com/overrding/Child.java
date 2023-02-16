package com.overrding;

public class Child extends Parent {

	@Override
	public void display() {
		System.out.println("child  display instance");
		super.display();
	}

	public static  void show() {
		System.out.println("child show  static");

	}

	/**
	 * parent instance method and chaild static method not possible b/c parent all
	 * are inherited to child
	  public static void express() {
	 * 
	 * 
	 * }
	 */
	public static void main(String[] args) {
		Child c1 = new Child();
		Parent p1 = new Parent();

		c1.display();
		c1.show();
		System.out.println("parent object calll:   -");
		p1.display();
		p1.show();
	}

}