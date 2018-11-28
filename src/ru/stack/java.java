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
public class java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
        Stack  <Integer> k =new Stack(5);
       System.out.println( k.isEmpty());
       k.push(5);
   k.search(5);
   myThread n=new myThread(5);
   Thread th=new Thread (n);
   //th.start();
   n.push(5);
   n.search(5);
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
    }
    
}
