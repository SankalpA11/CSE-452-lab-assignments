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
public class T42th {
    public static void main(String args[])
    {
        me a=new me();
        me b=new me();
        a.name=1;
        b.name=2;
        a.start();
        b.start();
    } 
}
class me extends Thread
{
    public int name,i,p=0;
    public void run()
    {
        for(i=1;i<=1000;i++)
        {
            System.out.println("Thread"+name+" : "+(p=p+i));
            try
            {
                sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(" Some problem");
            }
        }
    }
}