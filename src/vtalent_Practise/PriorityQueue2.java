package vtalent_Practise;

import java.util.*;


public class PriorityQueue2 {

	public static void main(String[] args) 
	{

		PriorityQueue<String> a = new PriorityQueue<String>();
         a.add("Train");
         a.add("Bus");
         a.add("Car");
         a.add("Zoo");
         
         System.out.println("head:"+a.element());
         System.out.println("head:"+a.peek());
         System.out.println("iterating queue elements"); 
         
         Iterator<String> itr = a.iterator(); 
         
         while(itr.hasNext())
         {  
           System.out.println(itr.next()); 
         
         }  
         
         a.remove();  
         a.poll();  
         System.out.println("after removing two elements:"); 
         
         Iterator<String> itr2=a.iterator(); 
         
         while(itr2.hasNext())
         {  
            System.out.println(itr2.next()); 
         
         
	      }
	}
	
	
}
