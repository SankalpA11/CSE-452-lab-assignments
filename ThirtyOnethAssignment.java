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
public class ThirtyOnethAssignment {
     public static void main(String args[])
 {
     X a=new X();
     Y b=new Y();
     C c=new C();
     X r;
     r=a;
     r.callme();
     r=b;
     r.callme();
     r=c;
     r.callme();
 }  
}
class X{
    void callme()
    {
        System.out.println(" INSIDE A'S CALLME METHOD");
    }
}
class Y extends X{
    void callme()
    {
        System.out.println(" INSIDE B'S CALLME METHOD");
    }
}
class C extends X{
    void callme()
    {
        System.out.println(" INSIDE C'S CALLME METHOD");
    }
    
}
