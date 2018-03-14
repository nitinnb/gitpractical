package com.nws.thisdemo;

public class CallingnewFirst extends  NewFirst{

	public void mymethod() {
		
		int a =34;
		System.out.println("prinintg the variable of class NewFirst:\t"+super.a);
		System.out.println("hello mymethod");
	}
	
	public static void main(String[] args) {
		
		CallingnewFirst cnf = new CallingnewFirst();
		
		cnf.mymethod();
	}
}
