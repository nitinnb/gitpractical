package com.nws.readinginput;

import java.util.Scanner;

public class Takinginput {
	
	public int add(int a , int b) {
		
		int c = a +b;
		return c;
	}
	
	public static void main(String[] args) {
		
		System.out.println("enter first number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		
		Takinginput ti = new Takinginput();
		int result = ti.add(a, b);
		System.out.println("addiiton of two numbers is "+ result);
		
	}
}

