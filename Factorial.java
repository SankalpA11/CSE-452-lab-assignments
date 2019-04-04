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
public class T24th {
    public static void main(String args[])
    {
        Factorial m=new Factorial();
        System.out.println("factorial of 4 is "+m.fact(4));
         System.out.println("factorial of 5 is "+m.fact(5));
          System.out.println("factorial of 6 is "+m.fact(6));
           System.out.println("factorial of 7 is "+m.fact(7));
            System.out.println("factorial of 8 is "+m.fact(8));
    }
    
}
public class Factorial(){
    int fact(int p)
    {
        int r;
        if(p<2)
        return 1;
        r=p*fact(p-1);
        return r;
    }
}
