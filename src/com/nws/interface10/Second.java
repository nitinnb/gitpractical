package com.nws.interface10;

public class Second implements First{

	public static void main(String[] args) {
		
		Second sc = new Second();
		sc.help();
		sc.helpfirst();
	}

	@Override
	public void help() {
		
	System.out.println("this is from first interface class Demo");	
	}

	@Override
	public void helpfirst() {
		
	System.out.println("this is inherited interface First from Demo interface");
		
	}
}
