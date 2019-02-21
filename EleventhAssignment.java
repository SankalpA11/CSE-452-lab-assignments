/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20171074;

import javax.swing.JOptionPane;

/**
 *
 * @author user11
 */
public class EleventhAssignment {
    public static void main(String args[])
    {
        int n;
        String a;
       a= JOptionPane.showInputDialog("Enter a number= ");
        n=Integer.parseInt(a);
        if(n%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd");
        }
    }
    
}
