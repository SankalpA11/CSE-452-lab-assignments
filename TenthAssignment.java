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
public class TenthAssignment {
     public static void main(String args[])
    {
        int x=-8;
        int y=x<0 ?-x:x;
        JOptionPane.showMessageDialog(null,"the positive value of -8 is "+y);
        int x1=4;
        int y1=x1<0 ?-x1:x1;
        JOptionPane.showMessageDialog(null,"the positive value of 4 is "+y1);
    }
    
}
