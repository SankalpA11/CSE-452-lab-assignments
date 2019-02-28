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

class T{
    int p,q;
    T(int a,int b)
    {
        p=a;
        q=b;
    }
    void m(T o)
    {
        o.p=o.p*5;
        o.q=o.q+100;
        
    }
}
public class TwentyThirdAssignment {
    


    public static void main(String args[])
    {
        T obj=new T(15,45);
       
         System.out.println("BEFORE Call value is "+obj.p+" "+obj.q+"");
         obj.m(obj);
          System.out.println("After calling value is "+obj.p+"  "+obj.q+"");
    }
}
    

