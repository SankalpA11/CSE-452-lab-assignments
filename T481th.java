/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20171014;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class T481th {
    public static void main(String args[])
            throws IOException
    {
        System.out.println("Enter string .................");
     BufferedReader reader=new BufferedReader(new InputStreamReader(System.in)); 
     String name=reader.readLine();
     System.out.println("You have Entered \n"+name);
    } 
}
