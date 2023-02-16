package com.araysSorting;

import java.util.ArrayList;
import java.util.Collections;

import com.sun.source.tree.EnhancedForLoopTree;

public class AuthorSort {
	public static void main(String[] args) {
		ArrayList<Author> books=new  ArrayList<Author>();
		books.add(new Author("Thomas",450,"Chemistry"));
		books.add(new Author("Falcon",650.5,"physics"));
		books.add(new Author("Gamesline",800,"java"));
		books.add(new Author("Thomas",650,"math"));
		
		Collections.sort(books);
		for (Author author : books) {
			System.out.println(author.publisher+" "+author.bookName+" "+author.price);
		}
		
	}
}
