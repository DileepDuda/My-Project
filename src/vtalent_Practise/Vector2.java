package vtalent_Practise;

import java.util.*;  


public class Vector2 
{

	public static void main(String args[])
	
	{  
		Vector<String> v = new Vector<String>();
		
		v.add("Notebook");
		v.add("Pen");
		v.add("Bag");
		
		Iterator<String> itr = v.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		   }
		}
		
	}
	