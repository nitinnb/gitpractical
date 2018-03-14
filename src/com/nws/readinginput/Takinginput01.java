package com.nws.readinginput;

import java.util.Scanner;

public class Takinginput01 {

	public static void main(String[] args) {
		
		System.out.println("enter the first number in screen");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("enter the second number in screen");
		int b = sc.nextInt();
		System.out.println("enter the third number in screen");
		int c = sc.nextInt();
		Takinginput01 ti = new Takinginput01();
		int result01 = ti.add(a,b);
		int result02= ti.mul(a, c);
		System.out.println("addition of two number is :\t"+result01);
		System.out.println("multiplication of two numbers is \t"+result02);
	}
	
	public int mul(int x, int y) {
		int z=x*y;
		return z;
	}
	public int add(int x, int y) {
		int z = x+y;
		return z;
	}
}
