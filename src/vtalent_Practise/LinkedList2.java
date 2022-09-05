package vtalent_Practise;

import java.util.*; 

public class LinkedList2 {

	 
	public static void main(String args[])
	 {  
		
	LinkedList<String> al=new LinkedList<String>();  
	al.add("CGOVT");  
	al.add("APGOVT");  
	al.add("CGOVT");  
	al.add("TGOVT");  
	
	Iterator<String> itr=al.iterator();  
	
	while(itr.hasNext())
	{  
	System.out.println(itr.next());  
	}  
	  }  
	} 

