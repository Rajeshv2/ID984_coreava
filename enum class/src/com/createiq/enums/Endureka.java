package com.createiq.enums;

enum Mobile{
	samsung(1099), Apple(1520),Google(16264);

	int price;
	Mobile(int p) {
		price=p;
	}
	int showPrice() {
		return price;
	}
}

public class Endureka{
	public static void main(String[] args) {
		System.out.println("cell phone list");
		for(Mobile m: Mobile.values())
		{
			System.out.println(m+"  cost: "+m.showPrice()+" rupees");
			}
		Mobile ret;
		ret=Mobile.valueOf("samsung");
		System.out.println(ret);
		}
	}

