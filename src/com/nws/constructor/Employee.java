package com.nws.constructor;

public class Employee {

    int EmpID;
    String EmpName;
    String EmpAddr;
    double EmpSal;

    public Employee(int EmpID, String EmpName, String EmpAddr, double EmpSal) {
        this.EmpID = EmpID;
        this.EmpName = EmpName;
        this.EmpAddr = EmpAddr;
        this.EmpSal = EmpSal;
        System.out.println(EmpID + "\t"+ EmpName + "\t" + EmpAddr + "\t" + EmpSal + "\t");
    }
    
    public static void main(String[] args) {
        
        Employee emp = new Employee(3415, "JavaCoder", "Begumpet", 35000);
    }
}

