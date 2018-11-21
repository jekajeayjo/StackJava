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
 */
/*
The class create new array of type Generic and the class have five methods(push,pick,isEmpty,search,pop) and one own constructor
-method "push" adds a new element in array if array is 
full then Exception to show that and if user wants to add 
element of type Exception returns that the element has other type
-method "isEmpty"  checks array has element or no and return boolean answer
-method "pop"  check array has elements or no and later return previous element
-method "pick" check array has elements  and later delete last element of array
and return array without last element
-method "search" check input element if element has other type then return exception
if element is same element then return desired element or elements and countyti desired 
element in array 
*/ 

public class Stack<T> {
   
    private Object [] array;
      private int numberOfElements;
   
   Stack (int size)
   {    
     
  
    this.array=new Object[size];
   
    this.numberOfElements=-1;
  
   
   }

  public void push (T element)
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

  public boolean isEmpty ()
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
  
   public T pop()
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

   
    public T pick()
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
   
     public int search(T element)
    {
       
    int count=0;
 
   
  
    for (int i=0;i<array.length;i++)
    {
    
   if (element==array[i])
   {   
       count++;
      
       System.out.println("locate of desired element "+(i+1));
   }
   
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
