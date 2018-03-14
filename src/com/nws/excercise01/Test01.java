package com.nws.excercise01;

public class Test01 {

	public static void main(String[] args) {
		
		Student01 st01 = new Student01();
		st01.setStu01ID(32);
		st01.setStu01addr("hyderabad");
		st01.setStu01name("John");
		st01.setStu01birthyear(1990);
		
		System.out.println("student whose name is "+st01.getStu01name()+"\n"+ "and whose roll number is "+st01.getStu01ID()+"\n"+"was born in year "+st01.getStu01birthyear()+"\n"+"lives in "+st01.getStu01addr());
		
	}
}

