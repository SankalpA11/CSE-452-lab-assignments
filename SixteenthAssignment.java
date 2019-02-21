/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20171074;

/**
 *to show the use of "continue" keyword
 * @author user11
 */
public class SixteenthAssignment {
    
    public static void main(String args[])
    {
        System.out.println("Odd number from 1 to 10");
        for(int i=0;i<10;i++)
        {
            if(i%2==0)
            {System.out.println(i+"-->Continue ");
                continue;
            }
            else
                {System.out.println(i+" ");}
        }
    }
}
    
    

