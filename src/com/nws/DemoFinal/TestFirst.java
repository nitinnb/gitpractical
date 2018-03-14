package com.nws.DemoFinal;

public class TestFirst extends First{

	@Override
	public void help() {
		
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		
		TestFirst tf = new TestFirst();
		//tf.a =43;
	}
}
