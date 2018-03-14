package com.nws.excercise05;

public class CallingCallingTest_12mar extends CallingTest_12mar {

	public void methodpresent() {
		System.out.println("this is teh method of present class CallingCallingTest_12mar\n");
	}
	
	@Override
		public void method01() {
		super.method01();
		System.out.println("this is the method1 which i will use after calling Test and calling Calling test\n");
	}
	
	public static void main(String[] args) {
		CallingCallingTest_12mar ct = new CallingCallingTest_12mar();
		ct.method01();
		ct.methodpresent();
		
	}
}
