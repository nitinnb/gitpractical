package com.nws.encap;

public class CallingEmployee {

	public static void main(String[] args) {
		
		CalledEmployee ce = new CalledEmployee();
		ce.setEmpid(1134);
		ce.setEmpaddr("begumpet");
		ce.setEmpdesk("floor");
		ce.setEmpsalary(34000.00);
		
		System.out.println("employe id is :"+ce.getEmpid()+"\nemployee address is :"+ce.getEmpaddr()+"\nemploye desk:"+ce.getEmpdesk()+"\nemployee salary:"+ce.getEmpsalary());
	}
}
