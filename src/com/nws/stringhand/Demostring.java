package com.nws.stringhand;

public class Demostring {

	public static void main(String[] args) {
		
		String sq = "University";
		String sr = "";
		//char ch = sq.charAt(3);
		
		System.out.println("variable at 5th place in teh string is \t"+sq.codePointAt(4));
		System.out.println("length of the string is  "+sq.length());
		System.out.println("appending the parameter string into our string and the result is\t"+sq.concat("Allahabad"));
		System.out.println("Comparing the main string with the parametr string and teh difference of match is :\t"+sq.compareTo("Unitdrsity"));
		System.out.println("value of parameter appearing in our string at ndex value \t"+sq.indexOf("v")); //Returns the index within this string of the first occurrence of the specified substring.
		System.out.println(sq.codePointCount(3, 6));
		System.out.println(sq.isEmpty());
		System.out.println(sr.isEmpty());
		//System.out.println(sq.);
	}
}
