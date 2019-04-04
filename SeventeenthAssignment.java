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
public class SeventeenthAssignment {
    public static void main(String args[])
  {
      boolean t=true;   // may use false insted
      first:          // Define first level
             {System.out.println("the use  of level break");  
      second:{        // Define the second level
          third:{     // Define third level
              if(t)   // if true 
                  break second;  // if the "if" breaks here go to second: 
          }
          System.out.println("this wil not execute");
  }
      System.out.println("this is part of first");
}
  }
    
}
