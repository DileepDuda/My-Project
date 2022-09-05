package vtalent_Practise;

import java.util.*;

public class LinkedListPractise01 {

	public static void main(String[] args) {
		
		LinkedList<Student> ll = new LinkedList<>();
				
		Student Un = new Student(10);
		ll.add(Un);
		
		ll.add(new Student(20));
		
		
		Iterator<Student> itr = ll.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}


{
	
	
}
}
class StudentA
{
	int Rollno;
	StudentA(int Rollno)
	{
		this.Rollno=Rollno;
		
	}
	public String toString()
	{
		return " " +Rollno;
	}

}
