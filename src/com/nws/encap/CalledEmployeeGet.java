package com.nws.encap;

public class CalledEmployeeGet {

	private int empid;
	private String empaddr;
	private String empdesk;
	private double empsalary;
	
	public int getEmpid() {
		return empid;
	}
	public String getEmpaddr() {
		return empaddr;
	}
	public String getEmpdesk() {
		return empdesk;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	public CalledEmployeeGet(int empid, String empaddr, String empdesk, double empsalary) {
		super();
		this.empid = empid;
		this.empaddr = empaddr;
		this.empdesk = empdesk;
		this.empsalary = empsalary;
	}

  
	
}
