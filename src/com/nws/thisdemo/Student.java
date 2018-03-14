package com.nws.thisdemo;

//here we are trying to call this keyword in a constructor by calling a parameterized constructor inside a default constructor
public class Student {

	int studid;
	String stuname;
	String stuaddr;
	
	
	public Student() {
		this(3412, "John");
		System.out.println("it is a default constructor\n");
	}


	public Student(int studid, String stuname) {
		
		this.studid = studid;
		this.stuname = stuname;
		System.out.println("parameterixed constructor\t"+studid + "\t"+stuname);
	}


	public Student(int studid, String stuname, String stuaddr) {
		this(2314, "Reil");
		this.studid = studid;
		this.stuname = stuname;
		this.stuaddr = stuaddr;
	}
	
	public static void main(String[] args) {
		
		Student st = new Student();
		
	}

	
}


