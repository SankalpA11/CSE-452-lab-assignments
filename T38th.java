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
public class T38th {
    public static void main(String args[])
    {
        try{
            int a=args.length;
            int b=43/a;
            System.out.println(" a   =  "+a);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out-of-bounds:"+e);
        }catch(ArithmeticException e)
        {
            System.out.println("Divided by 0:"+e);
        }
    }
    
}
