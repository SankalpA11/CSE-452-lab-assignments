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
public class T25th {
    public static void main(String args[])
    {
      Test ob=new Test();
      ob.a=20;
      ob.b=40;
      ob.Setc(200);
      System.out.println(" a  b and c are :"+ob.a+"  "+ob.b+"  "+ob.getc());
    }
    
}
class Test{
    int a;
    public int b;
    private int c;
    void Setc(int i)
    {
        c=i;
    }
    int getc()
    {
        return c;
    }
}
