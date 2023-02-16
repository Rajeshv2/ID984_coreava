package com.araysSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee e1=new Employee("Rajesh",1201,26);
		Employee e3=new Employee("Kalyan",1203,30);
		Employee e2=new Employee("Murali", 1202,27);
		Employee e4=new Employee("Karthik",1204,26);
		
		List<Employee> emp=new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		System.out.println("sorting list based on age :--");
		Collections.sort(emp);
		
		Iterator<Employee> itr=emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
