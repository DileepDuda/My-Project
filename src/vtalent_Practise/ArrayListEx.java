package vtalent_Practise;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		
		List al = new ArrayList();  //It will store all value like int and strings
		
		
		al.add("Dileep");
		
		al.add("Manisha");
		
		al.add("Vihaan");
		
		al.add(10);
		
		al.add(20);
		
		al.add(30.5);
		
		System.out.println(al);
		
     ListIterator itr = al.listIterator();
		
		System.out.println("List Forword");
		while(itr.hasNext())   //List Forword
			
		{
			System.out.println(itr.next());
		}
		
		System.out.println("List Reverse");
		while(itr.hasPrevious())    //LIST Reverse
		{
			System.out.println(itr.previous());
		}
		

	}

}
