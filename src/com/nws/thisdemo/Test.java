package com.nws.thisdemo;

public class Test {

	public void help() {
		
		int a = 8;
		System.out.println("local variable value here as :"+a);
	}
	
	public void save() {
		
		this.help();
		int a =98;
		System.out.println("printing the value of local variable as:"+a);
		
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.save();
	
	}
}
