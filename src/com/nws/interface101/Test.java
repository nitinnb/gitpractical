package com.nws.interface101;

public class Test extends Second{

	@Override
	public void a() {
		System.out.println("This is the method declared in interface class for a");
		
	}

	@Override
	public void b() {
		System.out.println("This is the method declared in interface class for b");
		
	}

	@Override
	public void c() {
		System.out.println("This is the method declared in interface class for c");
		
	}

	@Override
	public void e() {
		System.out.println("This is the method declared in abstract  class which is inheriting from interface for e");
		
	}

	@Override
	public void f() {
		System.out.println("This is the method declared in abstract  class which is inheriting from interface for f");
		
	}

	public static void main(String[] args) {
		
		Test ts = new Test();
		ts.a();
		ts.b();
		ts.c();
		ts.e();
		ts.f();
	}
	
}
