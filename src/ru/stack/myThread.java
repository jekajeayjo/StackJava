/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.stack;

/**
 *
 * @author kob
 */
public class myThread extends Thread{
Stack stack;
 public void setResource(Stack sStack)
 {
     this.stack=sStack;
 }
    

    @Override
    public void run() {
    try 
    {
        
            stack.push(this);
        
    }
    catch (Exception e)
    {
    System.out.println("error");
            }
    }
    
}
