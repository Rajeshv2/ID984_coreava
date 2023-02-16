package com.customized.immutableClass;

public class Address{
	String place;
	int pincode;
	public Address(String place, int pincode) {
		//super();
		this.place = place;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [place=" + place + ", pincode=" + pincode + "]";
	}
	
}

