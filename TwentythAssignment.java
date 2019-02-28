/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20171074;

/**
 * All about Method overloading 
 * @author user11
 */
public class TwentythAssignment {
    public static void main(String args[])
    {
        OverLoad p=new OverLoad();
        p.T1();
        p.T1(10.985);
        p.T1(25);
        p.T1(10,25);
    }
}
class OverLoad{
    void T1()
    {
        System.out.println("parameter is NOTHING");
    }
    void T1(int m)
    {
        System.out.println("parameter is "+m+"");
    }
    void T1(int m,int n)
    {
        System.out.println("parameters are "+m+"  "+n+"");
    }
    void T1(double a)
    {
        System.out.println("parameter is double "+a+"");
    }
    
}
