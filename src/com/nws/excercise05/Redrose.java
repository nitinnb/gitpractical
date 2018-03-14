package com.nws.excercise05;

public class Redrose extends Rose {
	
	public void redrose() {
		System.out.println("this is red rose class which is multilevel ineritance");
	}

	@Override
	public void color() {
		super.color();
		System.out.println("redrose is the color of actual flower");
	}
	public static void main(String[] args) {
		
		Redrose rr = new Redrose();
		rr.color();
		rr.redrose();
		
	}
}
