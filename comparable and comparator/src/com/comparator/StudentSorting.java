package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.sun.source.tree.EnhancedForLoopTree;

public class StudentSorting {
	public static void main(String[] args) {
		
		Student s1=new Student("Rajesh","guntakal",104);
		Student s2=new Student("Madhu","hindupur",103);
		Student s3=new Student("Anil","bellary" ,101);
		Student s4=new Student("Kalyan","hyd",105);
		Student s5=new Student("Hari","bangloor",100);
		Student s6=new Student("manoj", "bangloor",102);
		Student.academicYear="First year";
		
		ArrayList<Student> std=new ArrayList<Student>();
		std.add(s1);
		std.add(s2);
		std.add(s3);
		std.add(s4);
		std.add(s5);
		std.add(s6);
		
		Collections.sort(std,new SidComparator());
		for(Student s:std) {
			System.out.println(s);
		}
		System.out.println("sorting based on the name :------");
		Collections.sort(std,new SnameCamparator());
		for (Iterator iterator = std.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student);
		}
		System.out.println("sorting based on place :----");
		Collections.sort(std);
		for (Iterator iterator = std.iterator(); iterator.hasNext();) {
			Student student1 = (Student) iterator.next();
			System.out.println(student1);
		}
	}

}
