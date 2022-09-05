package vtalent_Practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListInterfaceExALL {                       //ArrayList
	
	int EmpId;
	String EmpName,Company,Address;
	
	ListInterfaceExALL(int EmpId,String EmpName,String Company,String Address)
	{
		this.EmpId  = EmpId;
		this.EmpName = EmpName;
		this.Company = Company;
		this.Address = Address;
	}

	public static void main(String[] args) {
		
		List<ListInterfaceExALL> li = new ArrayList<>();

	   
	    
		ListInterfaceExALL obj = new ListInterfaceExALL(100,"Dileep","TCS","HYDERABAD");
		ListInterfaceExALL obj1 = new ListInterfaceExALL(101,"Madhu","TCS","HYDERABAD");
		ListInterfaceExALL obj2 = new ListInterfaceExALL(102,"Ramu","TCS","HYDERABAD");
		ListInterfaceExALL obj3 = new ListInterfaceExALL(103,"Parameshwar","TCS","HYDERABAD");
		ListInterfaceExALL obj4 = new ListInterfaceExALL(104,"Sravan","TCS","HYDERABAD");
		ListInterfaceExALL obj5 = new ListInterfaceExALL(105,"Dillu","TCS","HYDERABAD");
		ListInterfaceExALL obj6 = new ListInterfaceExALL(106,"Dileep","TCS","HYDERABAD");
		
		li.add(obj);
		li.add(obj1);
		li.add(obj2);
		li.add(obj3);
		li.add(obj4);
		li.add(obj5);
		li.add(obj6);
	
		for(ListInterfaceExALL s:li)
			
		{
			System.out.println(s.EmpId+" "+s.EmpName+" "+s.Company+" "+s.Address);
		}
	
	

	}

}
 class Employee                //LinkedList
{
	int EmpNo;
	
	Employee(int EmpNo)
	  {
		  this.EmpNo = EmpNo;	
	    }
	public String toString() 
	{
		  return " "+EmpNo;
	   }
	

 
 
	public static void main(String args[])
	{
		LinkedList<Employee> ll = new LinkedList<>();
		
		ll.add(new Employee(150));
		
		System.out.println(ll);
		
		Iterator<Employee> itr = ll.iterator();	
	
		
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Vector v = new Vector();             //Vector
		
		v.add("Dileep");
		v.add("Madhu");
		v.add("Suresh");
		v.add("Ramu");
		v.add("Dileep");
		v.add("Madhu");
		v.add("Sravan");
		v.add("Praveen");
		v.add("Sandeep");
		
		System.out.println(v);
		
		System.out.println(v.capacity());
		System.out.println(v.firstElement());
		System.out.println(v.size());
		System.out.println(v.indexOf("Dileep"));
		System.out.println(v.lastIndexOf("Dileep"));
		System.out.println(v.remove(6));
		System.out.println(v.get(1));
		
        Vector v1 = new Vector(15,20);             
		
		v1.add("Manisha");
		v1.add("Haritha");
		v1.add("Sunitha");
		v1.add("Rani");
		v1.add("Radhika");
		v1.add("Mounika");
		v1.add("Sravani");
		v1.add("Pranitha");
		v1.add("Rajitha");
		v1.add("Rajitha");
		
		System.out.println(v1);
		
		System.out.println(v1.capacity());
		System.out.println(v1.firstElement());
		System.out.println(v1.size());
		System.out.println(v1.indexOf("Rajitha"));
		System.out.println(v1.lastIndexOf("Rajitha"));
		System.out.println(v1.remove(6));
		System.out.println(v1.get(1));
		
		Stack<String> s = new Stack<>();              //Stack
		
		s.push("Dileep");
		s.push("Madhu");
		s.pop();
		s.push("Suresh");
		s.push("Ramu");
		s.push("Dileep");
		s.push("Madhu");
		s.push("Sravan");
		s.push("Praveen");
		s.push("Sandeep");
		s.search("Dileep");
		s.peek();
		
		System.out.println(s);
		
		System.out.println(s.capacity());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.search("Madhu"));
		System.out.println(s.empty());
		}
	
	}
	
	
  
 
 
 
 
 
 
 
 
 
 

