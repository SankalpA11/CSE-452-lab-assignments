/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20171074;

/**
 * Using static method
 * @author Sankalpa Chowdhury
 */
public class TwentySixthAssignment {
    public static void main(String args[])
    {
        meth(55);
    }
    static int a=5;
    static int b;
    static void meth(int x)
    {
        System.out.println(" x ="+x);
        System.out.println(" a ="+a);
        System.out.println(" b ="+b);
    }
    static
    {
    System.out.println("................. STATIC ..................");   
    b=a*10;
    }
    
}
