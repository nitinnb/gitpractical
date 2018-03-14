package com.nws.constructor;

public class DemoCons {
    //defining just a block which will be executed after constructor
    {
        System.out.println("not a constructor but within a block\t\n");
    }
    
    //this is the constructor created which will be executed first
    public DemoCons() {
        System.out.println("printing here the default constructor\t\n");
    }
    
    public static void main(String[] args) {
        DemoCons dc =new DemoCons();  // defining an object of the class
    }

    
}
