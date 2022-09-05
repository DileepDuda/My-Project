package vtalent_Practise;

import java.util.*;


public class HashMap1 {

	

	public static void main(String[] args)
	 {
	 	HashMap<Integer,String>map = new HashMap<Integer,String>();  //creating hashmap
	 	
	 	map.put(1,"Train");     // put elements in map
	 	map.put(2,"Bus");
	 	map.put(3,"Car");
	 	
	 	System.out.println("Iterating hashmap");
	 	
	 	for(@SuppressWarnings("rawtypes") Map.Entry m : map.entrySet())
	 	{
	 		System.out.println(m.getKey()+" "+m.getValue());
	 	}
	 	}
	 }


