package com.nws.abstraction;

public class CallingCallingTest_abst_12mar extends CallingTest_abst_12mar{

	public static void main(String[] args) {
		
		CallingCallingTest_abst_12mar cct= new CallingCallingTest_abst_12mar();
		cct.functa();
		cct.functb();
		cct.functc();
		cct.functx();
		cct.functy();
		cct.functz();
		
	}

	@Override
	public void functx() {
		System.out.println("this is the x function of second implemented test abstraction class");
		
	}

	@Override
	public void functy() {
		System.out.println("this is the y function of second implemented test abstraction class");
		
	}

	@Override
	public void functz() {
		System.out.println("this is the z function of second implemented test abstraction class");
		
	}

	@Override
	public void functa() {
		System.out.println("this is the a function of first implemented test abstraction class");
		
	}

	@Override
	public void functb() {
		System.out.println("this is the b function of first implemented test abstraction class");
		
	}

	@Override
	public void functc() {
		System.out.println("this is the c function of first implemented test abstraction class");
		
	}
}
