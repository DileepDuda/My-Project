package vtalent_Practise;

import java.util.*;

public class Dequeue2 

{
	
	public static void main(String [] args)
	
	{
		//creating dequeue and adding elements
		
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Drive");  
		deque.add("Jump");  
		deque.add("Break"); 
		deque.add("Break");
		
		//Traversing elements  
		for (String a : deque) 
		{  
		   System.out.println(a);  
		
		    }  
	
	
	}
	


}
