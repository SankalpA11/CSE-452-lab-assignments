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
public class T27th {
    public static void main(String args[])
    {
        StaticDemo.callme();
        System.out.println(" b = "+StaticDemo.b);
    }  
}
class StaticDemo{
    static int a=55;
    static int b=66;
    static void callme()
    {
        System.out.println("a = "+a);
    }
}