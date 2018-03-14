
package com.nws.first02march;

public class DemoMethod {

    int multiplication(int a, int b){
        int c = a*b;
        return c;
    }
    
    static int division(int c , int d){
        int e = c/d;
        return e;
        
    }
    double areacalc(float r){
        double area = 3.14*r*r;
        return area;
    }
    public static void main(String[] args) {
        DemoMethod dm = new DemoMethod();
        int result = dm.multiplication(3,9);
        System.out.println("result of multiplication "+result);
        int divresult = DemoMethod.division(5,2);
        System.out.println("result of division "+divresult);
        double area = dm.areacalc(4);
        System.out.println("result of multiplication "+area);
    }
}
