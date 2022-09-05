package vtalent_Practise;

import java.util.*;


public class VectorPractise {

	public static void main(String[] args) {
		Vector v = new Vector();  /*we can increase capacity by manually like vector(5)
		                        or vector(5,2)= capacity size is 7 */
		
		v.add("Dileep");          //Default memory capacity is 10
		v.add("Madhu");                           //If we add more elements capacity will increase double or 100%
		v.add("Ramu"); 
		v.add("Dileep"); 
		
		System.out.println(v);
		
		System.out.println(v.capacity());
		
		System.out.println(v.add("Dileep"));
		
		System.out.println(v.contains(2));
		
		System.out.println(v.elementAt(4));
		
		System.out.println(v.size());
		
		
		Vector v1 = new Vector(5,10);  
		
		v1.add("Madhu");                          
		v1.add("Ramu"); 
		v1.add("Dileep");
		v1.add("Madhu");                          
		v1.add("Ramu"); 
		v1.add("Dileep");
		v1.add("Madhu");                          
		v1.add("Ramu"); 
		v1.add("Dileep");
		v1.add("Madhu");                          
		v1.add("Ramu"); 
		v1.add("Dileep");
		v1.add("Madhu");                          
		v1.add("Ramu"); 
		v1.add("Dileep");
		
        System.out.println(v1);
		
		System.out.println(v1.capacity());
		
		System.out.println(v1.add("Dileep"));
		
		System.out.println(v1.contains(14));
		
		System.out.println(v1.elementAt(4));
		
		System.out.println(v1.size());   //error
		
	}

}
