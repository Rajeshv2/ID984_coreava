package com.comparator;

public class Student implements Comparable<Student>{
	  static String academicYear;
	String sname;
	String place;
	int sid;
	public Student(String sname,String place, int sid) {
		this.sname = sname;
		this.place = place;
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "Student [academicYear=" + academicYear + ", sname=" + sname + ", place=" + place + ", sid=" + sid + "]";
	}
	@Override
	public int compareTo(Student o) {
		int result=this.place.compareTo(o.place);
		return result;
	}
	
	

}
