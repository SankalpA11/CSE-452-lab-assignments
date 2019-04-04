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
class T3{
    int p,q;
    void m11(int a,int b)
    {
        p=a;
        q=b;
    }
    void m5(T3 o)
    {
        o.p=o.p*5;
        o.q=o.q+100;
        
    }

    void m5(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
public class T23th {
    public static void main(String args[])
    {
        T3 p=new T3();
        int a=55,b=100;
         System.out.println("BEFORE Call value is "+a+" "+b+"");
         p.m5(a,b);
          System.out.println("After calling value is "+a+"  "+b+"");
    }
    
}
