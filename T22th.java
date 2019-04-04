/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20171014;

/**
 *
 * @author user11
 */
class T2{
    void m1(int a,int b)
    {
        a=a+10;
        b=b*10;
    }
}
public class T22th {
    public static void main(String args[])
    {
        T2 p=new T2();
        int a=55,b=100;
         System.out.println("BEFORE Call value is "+a+" "+b+"");
         p.m1(a,b);
          System.out.println("After calling value is "+a+"  "+b+"");
    }
    
}
