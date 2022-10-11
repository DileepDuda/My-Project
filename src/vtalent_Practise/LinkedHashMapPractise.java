package vtalent_Practise;

import java.util.*;

public class LinkedHashMapPractise {
	public static void main(String[] args) {
		
		LinkedHashMap lhm = new LinkedHashMap();
		
		lhm.put("SNo", 10);                // Output showing Insert order 
		lhm.put("Name", "Mani");
		lhm.put("College", "Global Engg");
		lhm.put("Address", "HYD");
		lhm.put("Address", "HYD");
		
   //    lhm.get("College");
         lhm.remove("Address");
    //   lhm.entrySet();
		
    Set s = lhm.keySet();
    
    Iterator ite = s.iterator();
    
    while(ite.hasNext())
    {
     Object o = ite.next();
     String str =(String)o;
     System.out.println(str+":"+lhm.get(str));
      
	}

}
}



