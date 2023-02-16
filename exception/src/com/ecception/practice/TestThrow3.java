package com.ecception.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrow3 {
	public static void method() throws FileNotFoundException {
		FileReader file=new FileReader("E:\\streams\\files.txt");
		BufferedReader fileinput=new BufferedReader(file);
		throw new FileNotFoundException();
	}
	public static void main(String[] args) {
		try {
		method();
	}catch(FileNotFoundException fe) {
		fe.printStackTrace();
	}
		System.out.println("rest of  the code");
	}
}
