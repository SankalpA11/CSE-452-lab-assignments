/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.Stack;
package javaapplication20171014;

/**
 *
 * @author user11
 */
public class T50th {
    public static void main(String args[])
    {
       Stack<Integer> stack=new Stack<Integer>();
       stack_push(stack);
       stack_pop(stack);
    }
        static void stack_push(Stack<Integer>stack)
    {
        for(int i=0;i<10;i++)
        {
            stack.push();
        }
    }
static void stack_pop(Stack<Integer>stack)
{
    System.out.println(" POP>>>>>...");
    for(int i=0;i<10;i++)
    {
        Integer l=(Integer) stack.pop();
        System.out.println(l);
    }
}
}