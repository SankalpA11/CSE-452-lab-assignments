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
public class T30th {
    public static void main(String args[])
    {
        L subOb=new L(1,5,9);
        subOb.show();
    }   
}
class P{
    int i,j;
    P(int a,int b)
    {
        i=a;
        j=b;
    }
    void show()
    {
        System.out.println(" i   j  :"+i+"  "+j+"");
    }
}
class L extends P{
    int k;
    L(int a,int b,int c)
    {
        super(a,b);
        k=c;
    }
    void show(){
        System.out.println(" k   "+k);
    }
}