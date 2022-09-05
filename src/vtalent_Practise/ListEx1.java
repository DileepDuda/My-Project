package vtalent_Practise;

import java.util.*;

public class ListEx1 {

	public static void main(String[] args) {
		
     List<String> al = new ArrayList<>();    //new ArrayList<String>
		
		al.add("Dil");
		al.add("Mani");
		al.add("Chinnu");
		al.add("Chitti");
		al.add("Vihaan");
		al.add("Vihaan");
		al.add(3, "Vignan");
		
		
		System.out.println(al);
		

List<String> al2 = new ArrayList<>();    //new ArrayList<String>
		
		al2.add("Shakaraiah");
		al2.add("Shankaramma");
		al2.clear();
		al2.add("Sandeep");
		al2.add("Dileep");
		al2.add("Dileep");
		
List<String> al3 = new ArrayList<>();    //new ArrayList<String>
			
			al3.add("Sandeep");
			al3.add("Pushpalatha");
			al3.add("Vignan");
			al3.add("Vignan");
			al3.add("sandeep");
			al3.set(3, "Srestanand");
			al3.sort(String.CASE_INSENSITIVE_ORDER);
			al3.sort(Comparator.naturalOrder());
			
			System.out.println((al3));
		
		al2.addAll(al);
		
		System.out.println(al2);
		
		System.out.println(al.equals(al2));
		
		System.out.println((al3));
		
		System.out.println(al.isEmpty());
		
		System.out.println(al2.contains("Chinnu"));
		
		System.out.println(al.lastIndexOf("Vihaan"));
		
		System.out.println(al.indexOf("Vihaan"));
		
		System.out.println(al.get(2));
		
		System.out.println(al.hashCode());
		
		System.out.println(al2.remove(0));
		
		System.out.println(al.remove("Mani"));
		
		System.out.println((al3.subList(1, 5)));
		
		
		
		ListIterator<String> itr = al.listIterator();
		
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
		
	//	System.out.println(al);
	}

}
