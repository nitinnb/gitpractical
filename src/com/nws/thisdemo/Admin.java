package com.nws.thisdemo;

public class Admin {

	int AdminID;
	String Adminname;
	
	
	public Admin() {
		
		System.out.println("this is the default constructor of admin which we will test form helloadmin\n");
	}


	public Admin(int adminID, String adminname) {
		super();
		AdminID = adminID;
		Adminname = adminname;
	}
	
	
}
