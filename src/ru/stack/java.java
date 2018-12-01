/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.stack;
import java.util.concurrent.*;

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
       Semaphore sem=new Semaphore(1);
       Stack  <Integer> k =new Stack(5);
             Stack  <String> ks =new Stack(3);
        try
        {
       synchronized(k){
         System.out.println( k.isEmpty());
          k.push(5);
           k.search(5);
             }
      synchronized(ks){
                ks.push("asd");
                ks.search("asd");
           }
   
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
    }
    
}
