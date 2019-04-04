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
public class T34th 
{
public static void main(String args[])
{
    Callback c=new Client();
    c.Callback(42);
}
}
class Client implements Callback{
    public void Callback(int p)
    {
        System.out.println(" CALL BACK CALLED WITH "+p);
    }
}
interface Callback 
{
    void Callback(int param);
}
