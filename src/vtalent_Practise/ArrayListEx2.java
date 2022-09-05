package vtalent_Practise;

import java.util.*;


public class ArrayListEx2 {

	public static void main(String[] args) {
		
/*		List<String> al = new ArrayList<>();    //new ArrayList<String>
		
		al.add("Dil");
			
    	al.add("Dil");   //List  allows duplicate values
		
	al.add(25);  Here we can't allow int values because we mentioned <String>.
		
		
//		System.out.println(al);
		
		for(Integer i:al)
		{
			System.out.println(al);
		}
		
	*/	
		
		List<Integer> al = new ArrayList<>();  
		
		al.add(25);
		
		al.add(25);    //List  allows duplicate values
		
//		al.add("Dil"); Here we can't allow String values because we mentioned <Interger>.
		
		
//		System.out.println(al);
		
		for(Integer i:al)
		{
			System.out.println(al);
		}
				
	}

}
