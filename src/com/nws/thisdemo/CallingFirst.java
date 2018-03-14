package com.nws.thisdemo;

public class CallingFirst extends First {

	public void mymethod() {
		
		super.help();
		System.out.println("this is my method\n");
	}
	
	public static void main(String[] args) {
		CallingFirst  cf = new CallingFirst();
		cf.mymethod();
		
		
	}
}
