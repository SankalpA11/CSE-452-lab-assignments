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
public class T21th {
    public static void main(String args[])
    {
        T1 p1=new T1(100,22);
        T1 p2=new T1(100,22);
        T1 p3=new T1(-1,-1);
        System.out.println("p1==p2 "+p1.equalTo(p2));
        System.out.println("p1==p3 "+p1.equalTo(p3));
    }
    
}
class T1{
    int a,b;
    T1(int p,int q)
    {
        a=p;
        b=q;
    }
    boolean equalTo(T1 o)
    {
        if(o.a==a&&o.b==b)
            return true;
        else
         return false;
    }
}