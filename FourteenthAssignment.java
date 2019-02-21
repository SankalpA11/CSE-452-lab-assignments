/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20171074;

/**
 *
 * @author user11
 */
public class FourteenthAssignment {
     public static void main(String args[]) //Switchcase assignment
  {
      int i;
      for(i=0;i<5;i++)
          switch(i)
      {
              case 0:
                  System.out.println("i is zero.");
                 
              case 1:
                  System.out.println("i is one.");
                 
              case 2:
              System.out.println("i is two.");
                  
              case 3:
                  System.out.println("i is three.");
                  
              case 4:
                  System.out.println("i is four.");
              default:
                  System.out.println("i is greater than 4");
      }
  }
    
}
