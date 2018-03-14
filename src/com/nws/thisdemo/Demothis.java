package com.nws.thisdemo;

public class Demothis {
	
	int a = 10;   //non static variable
	
	public void help() {
		
		int a =9;
		System.out.println("prinitng instance by using keyword this as:"+this.a);
		System.out.println("printing local variable as :"+a);
	}
	
	public static void main(String[] args) {
		
		Demothis dt = new Demothis();
		dt.help();
	}

}
