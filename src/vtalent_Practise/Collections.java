package vtalent_Practise;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Collection{  
	public static void main(String args[])
	{  
	List<String> list1=new ArrayList<String>();  //Creating arraylist  
	list1.add("Ravi");   //Adding object in arraylist  
	list1.add("Vijay");  
	list1.add("Ravi");  
	list1.add("Ajay");  
	
	//Traversing list through Iterator  
	Iterator<String> itr=list1.iterator();  
	
	while(itr.hasNext())
	{  
	System.out.println(itr.next()); 
	
	}  
	     }  
	}  

