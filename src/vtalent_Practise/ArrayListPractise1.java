package vtalent_Practise;

import java.util.ArrayList;
import java.util.Iterator;

class ArrayListPractise1{  
	public static void main(String args[])
	{  
	ArrayList<String> list=new ArrayList<String>();  //Creating arraylist  
	list.add("Dileep");   //Adding object in arraylist  
	list.add("Madhu");  
	list.add("Vihaan");  
	list.add("Dileep");  
	
	//Traversing list through Iterator  
	Iterator<String> itr=list.iterator();  
	while(itr.hasNext())
	{  
	System.out.println(itr.next()); 
	
	}  
	     }  
	}  