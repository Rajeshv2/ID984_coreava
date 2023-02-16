package com.araysSorting;

public class Author implements Comparable<Author>{
	String publisher;
	double price;
	String bookName;
	public Author(String publisher, double price, String bookName) {
		super();
		this.publisher = publisher;
		this.price = price;
		this.bookName = bookName;
	}
	@Override
	public int compareTo(Author o) {
		int last=this.publisher.compareTo(o.publisher);
		return last==0? this.bookName.compareTo(o.bookName):last;
	}
	
}
