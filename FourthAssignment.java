/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20171074;
import javax.swing.*;

/**
 *
 * @author user11
 */
public class FourthAssignment {
    public static void main(String[] args) {
        String choice;
       
        int Input = 0;
        
       while(Input!=(-99))
        {
        choice = JOptionPane.showInputDialog("Enter 1 to perform Addition\n"+
                "Enter 2 to perform Substraction\n"+
                "Enter 3 to perform Multiplication\n"+
                "Enter 4 to perform Division\n"+
                "Enter -99 to quit");
        
        Input = Integer.parseInt(choice);
        
        String firstnumber;
        String secondnumber;
        
        float n1,n2,result;
        
         
          
        
         switch(Input)
         {
             case 1:
                 if(Input==1)
                 {
                     firstnumber=JOptionPane.showInputDialog("Enter the value of the first number: ");
                     secondnumber=JOptionPane.showInputDialog("Enter the value of the second number: ");
         
                      n1=Float.parseFloat(firstnumber);
                      n2=Float.parseFloat(secondnumber);
                     result = (n1 + n2);
                     JOptionPane.showMessageDialog(null,"The sum is : "+result,"Result is",JOptionPane.PLAIN_MESSAGE);
                 }
             break;
                 
             case 2:
                 if(Input==2)
                 {
                         firstnumber=JOptionPane.showInputDialog("Enter the value of the first number: ");
                         secondnumber=JOptionPane.showInputDialog("Enter the value of the second number: ");
         
                      n1=Float.parseFloat(firstnumber);
                      n2=Float.parseFloat(secondnumber);
                     result = (n1 - n2);
                     JOptionPane.showMessageDialog(null,"The substraction is : "+result,"Result is",JOptionPane.PLAIN_MESSAGE);
                 }
             break;
                 
             case 3:
                 if(Input==3)
                 {
                         firstnumber=JOptionPane.showInputDialog("Enter the value of the first number: ");
                         secondnumber=JOptionPane.showInputDialog("Enter the value of the second number: ");
         
                      n1=Float.parseFloat(firstnumber);
                      n2=Float.parseFloat(secondnumber);
                     result = (n1 * n2);
                     JOptionPane.showMessageDialog(null,"The product is : "+result,"Result is",JOptionPane.PLAIN_MESSAGE);
                 }
             break;
                 
             case 4:
                 if(Input==4)
                 {
                         firstnumber=JOptionPane.showInputDialog("Enter the value of the first number: ");
                         secondnumber=JOptionPane.showInputDialog("Enter the value of the second number: ");
         
                      n1=Float.parseFloat(firstnumber);
                      n2=Float.parseFloat(secondnumber);
                     result = (n1/n2);
                     JOptionPane.showMessageDialog(null,"The division is : "+result,"Result is",JOptionPane.PLAIN_MESSAGE);
                 }
             break;
             case -99:
                 
             System.exit(0);
             //break;
         }
             
         
        }
       
             
              
             
     
         
         
        
    }
}
        
        

    
    

