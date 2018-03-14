package com.nws.abstraction;

public class Third extends Second {

	@Override
	public void d() {
		System.out.println("this is d method of immediate parent class");
		
	}

	@Override
	public void e() {
		System.out.println("this is e method of immediate parent class");
		
	}

	@Override
	public void f() {
		System.out.println("this is f method of immediate parent class");
		
	}

	@Override
	public void a() {
		System.out.println("this is a method of grand parent class");
		
	}

	@Override
	public void b() {
		System.out.println("this is b method of grand parent class");
		
	}

	@Override
	public void c() {
		System.out.println("this is c method of grand parent class");
		
	}
    public static void main(String[] args) {
	
    	Third th = new Third();
    	th.a();
    	th.b();
    	th.c();
    	th.d();
    	th.e();
    	th.f();
}
}
