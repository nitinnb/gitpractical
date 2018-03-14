package com.nws.excercise05;

public class HelloDemo extends Demo {
	
	@Override
	public void help() {
		
		System.out.println("this is help method showing Hello Demo class help........");
		
	}
	
	public static void main(String[] args) {
		
		HelloDemo hd = new HelloDemo();
		hd.save();
		hd.help();
		
	}

}
