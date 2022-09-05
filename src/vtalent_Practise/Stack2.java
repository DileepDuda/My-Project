package vtalent_Practise;

import java.util.*; 

 public class Stack2
 
 {
  public static void main(String [] args)
    {
	 Stack<String> stack = new Stack<String>();
	   
	 stack.push("Door");
	 stack.push("Window");
	 stack.push("Ventilator");
	 stack.pop();
	 
	 Iterator<String> itr =stack.iterator();
	 
	 while(itr.hasNext())
	   {
		 System.out.println(itr.next());
	     }
	   	  
	  
  }

}  