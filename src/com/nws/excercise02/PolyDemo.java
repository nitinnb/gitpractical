package com.nws.excercise02;

public class PolyDemo {

	
	public int add(int a , int b)
	{
		int c = a+b;
		return c;
	}
	
	public double add(double a, int b)
	{
		double c =a+b;
		return c;
	}
	
	public double add(double a , double b)
	{
		double c = a+b;
		return c;
	}
	
	public static void main(String[] args) {
		
		PolyDemo pd = new PolyDemo();
		System.out.println("addition of two integer numbers 3 and 4 is \t"+pd.add(3, 4));
	}
}

