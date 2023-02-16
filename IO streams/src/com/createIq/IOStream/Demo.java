package com.createIq.IOStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		//System.out.println("simple message");
		//System.err.print("error message");
		int i=System.in.read();
		System.out.println((char)i);
		
		try {
			FileOutputStream fo=new FileOutputStream("E:\\rajeshbabu.txt");
			fo.wait(56);
			fo.close();
			System.out.println("sucess");
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}

}
