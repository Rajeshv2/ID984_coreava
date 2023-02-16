package com.objectcreation5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {
	public static void main(String[] args) {
		String filepath="abc.txt";
		Employee e1=new Employee("Raju", 55000.0);
		try {
			FileOutputStream fileot=new FileOutputStream(filepath);
			ObjectOutputStream obj=new ObjectOutputStream(fileot);
			obj.writeObject(e1);
			obj.flush();
			obj.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fin = new FileInputStream("abc.txt");
			ObjectInputStream oin=new ObjectInputStream(fin);
			Employee e2=(Employee) oin.readObject();
			System.out.println(e2.getName());
			System.out.println(e2.getSalary());
			oin.close();
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		
	}

}
