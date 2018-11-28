/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.stack;

import java.util.ArrayList;

/**
 *
 * @author kob
 * @version  1.1
 * @since  1.0
 * This is class Stack which add input values in array of Gneric Type
 */


public class Stack<T> {
   
    private Object [] array;
      private int numberOfElements;
   /**
    * This constructor create array of Generic type
    * @param size the field which will be  to create a array of  certain size
    */
   Stack (int size)
   {    
     
  
    this.array=new Object[size];
   
    this.numberOfElements=-1;
  
   
   }
/**
 * <p><strong>The method adds element in array</strong></p> 
 * @param element it is element which is added in array 
 * @throws RuntimeException if element will be other type then return error or if array will be full  then return error that array is full
 */
  public synchronized void push (T element)
  {
    try
    {
  int i=++numberOfElements;

     array[i]= element;
    
     System.out.println("numberOfElements is "+numberOfElements);
   
       System.out.println("numberOfElements is []   "+ array[i]);
    }
    catch (ArrayIndexOutOfBoundsException e)
    {
    System.out.println("Error!/n Array is full");
    }
     catch (ArrayStoreException e)
    {
    System.out.println("Error!/n Other type");
    }
  }
 /**
  *  <strong>IsEMpty</strong> - <p> the method which  checks array full array or not
  * @return empty in boolean type
  */
  public synchronized boolean isEmpty ()
    {
        boolean empty =true;
      for (int i=0;i<array.length;i++)
      {
      if (array[i]!=null)
      {
      empty=false;
      break;
      }
      }
        

    return empty;
    }
  /**
   * the method shows previously alement of array 
   * @return numberOfElements of array
   */
   public synchronized T pop()
    {
       
    if (isEmpty())
    {
        
    System.out.println("стэк пустой");
    
    return null;
    }
    else 
    {
        
             System.out.println("numberOfElements is "+numberOfElements);
    return   (T) array[numberOfElements--];
    }
      
    }

   /**
    * The Method delete <i>last</i> (upper) element  and show all element whithout <i>last</i>
    * @return array[numberOfElements] 
    */
    public synchronized T pick()
    { 
        
        if (isEmpty()){
             
            System.out.println("стэк пустой ");
         
        return null;
        }
        else
        {
           
        
                 System.out.println("numberOfElements is "+numberOfElements);
                
    return       (T)  array[numberOfElements];
    
        }
    }
   /**
    *  The method is looking for an element in array
    * @param element is input values for search
    * @return count of found elements of array
    * @throws  RuntimeException if element will be other type then show error 
    */
     public synchronized int search(T element)
    {
       
    int count=0;
 
   
  try 
  {
    for (int i=0;i<array.length;i++)
    {
    
   if (element==array[i])
   {   
       count++;
      
       System.out.println("locate of desired element "+(i+1));
   }
   
    }
  }
  
     catch (ArrayStoreException e)
    {
    System.out.println("Error!/n Other type");
    }

    if (count ==0)
    {      
        System.out.println("not found");
        return 0;
                }

    else 
    {
      System.out.println("count found element "+count);
      return count;
    }
    }
 
}
