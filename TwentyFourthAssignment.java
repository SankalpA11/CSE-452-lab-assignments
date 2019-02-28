/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20171074;

/**
 * Recursion program
 * @author user11
 */

class Factorial{
    int fact(int p)
    {
        int r;
        if(p==1)
            return 1;
        else
        r=p*fact(p-1);
        return r;
    }
    
}
public class TwentyFourthAssignment {
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
 
