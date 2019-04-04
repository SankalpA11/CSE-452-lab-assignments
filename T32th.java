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
public class T32th {
    public static void main(String args[])
    {
        Rectangle r=new Rectangle(10,20);
        Triangle t=new Triangle(10,8);
        Figure figref;
        figref=r;
       System.out.println(" AREA IS "+figref.area());
       figref=t;
       System.out.println(" AREA IS "+figref.area());
    }   
}
abstract class Figure{
    double dim1;
    double dim2;
    Figure(double a,double b)
    {
        dim1=a;
        dim2=b;
    }
    abstract double area();
}
class Rectangle extends Figure{
    Rectangle(double a,double b)
    {
        super(a,b);
    }
    double area(){
        System.out.println("INSIDE AREA FOR RECTANGLE");
        return dim1*dim2;
    }
}
class Triangle extends Figure{
    Triangle(double a,double b)
    {
        super(a,b);
    }
    double area(){
        System.out.println("INSIDE AREA FOR RECTANGLE");
        return dim1*dim2/2;
    }
}