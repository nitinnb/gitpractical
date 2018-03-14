
package com.nws.first02march;

public class LocalVar {

    int a=35;
    {
        System.out.println("variable which is defined gloablly basis has value\t"+a);
    }
    {
        int b=56;
        System.out.println("variable which is defined gloablly basis has value\t"+b);
    }
    static{
        
        int c=97;
        System.out.println("varibale which is defined locally has value\t"+c);// dont we need to define the class name here
    }
    public static void main(String[] args) {
        LocalVar lv=new LocalVar();
    }
}
