package vtalent_Practise;

import java.util.Scanner;

public class ScannerEx {
	
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name");
		
		String name = sc.nextLine();
		
		System.out.println("Name = "+name);
		
		System.out.println("Enter Your RollNo");
		
		int i = sc.nextInt();
		
		System.out.println("RollNo = "+i);
		
		 System.out.println("Enter Salary");
		
	     long a = sc.nextLong();
		
		 System.out.println("Salary = "+a);
		
		 sc.close();

	}

}
