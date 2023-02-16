package com.clone.examples;

public class Student implements Cloneable{
	String name=null;
	int id=0;
	Student(){}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	Student(String name,int id){
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1=new Student("ramu",121);
		Student s2=(Student) s1.clone();
		System.out.println(s1);
		System.out.println(s2);
		s1.setId(333);
		System.out.println(s2);
		

	}

}
