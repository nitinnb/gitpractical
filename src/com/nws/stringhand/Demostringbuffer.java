package com.nws.stringhand;

public class Demostringbuffer {
	
	public static void main(String[] args) {
		
		//A thread-safe, mutable sequence of characters. A string buffer is like a String, but can be modified. At any point in time it contains 
		//some particular sequence of characters, but the length and content of the sequence can be changed through certain method calls. 
		
		
		StringBuffer sb = new StringBuffer("Olympics");
		sb.append("Qatar");
		System.out.println("appended string passed in parameter in teh main string and is method overloading\t"+sb);
	}

}
