package com.nws.variabledemo;

public class VarDemo {

    int a=90;
    static int b= 35;
    public static void main(String[] args) {
        VarDemo vd = new VarDemo();
        System.out.println("non static variable value\t"+vd.a);
        System.out.println(" static variable value\t"+VarDemo.b);
        System.out.println("\n");
    }
}