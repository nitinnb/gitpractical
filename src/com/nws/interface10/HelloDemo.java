package com.nws.interface10;

public class HelloDemo implements Demo {

	@Override
	public void help() {
		System.out.println("hello help using implement method and interface instead of abstract class");
		
	}
	
	public static void main(String[] args) {
		
		HelloDemo hd = new HelloDemo();
		hd.help();
	}
	
	
}
