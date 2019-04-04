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
public class T35th  extends Dog ,Mon {
    public static void main(String args[])
    {
     T35th p=new T35th();
     p.display33();
    }
}
class Dog
{
    String color="BLACK";
    void display33()
    {
        System.out.println(color);
    }
}
class Mon
{
    int height=22;
    void display33()
    {
        System.out.println(height);
    }
}