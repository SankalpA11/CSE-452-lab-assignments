/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20171074;

/**
 *
 * @author user11
 */
public class TwentyNinethAssignment {
     public static void main(String args[])
    {
        B subOb=new B(1,2);
        subOb.show();
    }
    
}
class A{
    int i;
}
class B extends A{
    int i;
    B(int a,int b)
    {
        super.i=a;
        i=b;
    }
    void show()
    {
        System.out.println(" i in superclass : "+super.i);
        System.out.println(" i in subclass : "+i);
    }
}
    

