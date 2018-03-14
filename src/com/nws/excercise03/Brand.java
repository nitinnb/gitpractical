package com.nws.excercise03;

public class Brand extends Car {
	
	public void audi() {
		
		System.out.println("this brand of car is Audi\n");
	}
	
	public static void main(String[] args) {
		
		Brand br = new Brand();
		br.brand();
		br.audi();
		
	}

}
