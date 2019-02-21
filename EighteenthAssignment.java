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
public class EighteenthAssignment {
     public static void main(String args[])
  {
      int i,j;
      outer:for(i=0;i<5;i++)
      {System.out.print("\n ");
          
          for( j=0;j<5;j++)
          {
              if(j>i)
                  continue outer;
              System.out.print(" "+i*j);
          }
          
          }
  
      }
    
}
