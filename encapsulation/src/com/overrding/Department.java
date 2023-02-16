package com.overrding;

public class Department extends Collage {

//	@Override
//	protected void gate() {
//		System.out.println("gate department permission 2");
//		super.gate();
//	}

	@Override
	public void gust() {
		System.out.println("GUST Ddepartmeent permission  2");
		super.gust();
	}

	public static void main(String[] args) {
		
		Department d=new Department();
		d.gate();
		d.gust();
	}
}
