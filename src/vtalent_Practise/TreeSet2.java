package vtalent_Practise;

import java.util.*; 

public class TreeSet2 
{

	public static void main(String[] args) 
	{
		   
		//Creating and adding elements  
		TreeSet<String> set=new TreeSet<String>();  
		
		set.add("Flow");  
		set.add("Break");  
		set.add("Flow");  
		set.add("Continue"); 
		
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext())
		{  
		    System.out.println(itr.next());  
		  }  
		}  
	}
