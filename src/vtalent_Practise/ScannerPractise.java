package vtalent_Practise;

import java.util.Scanner;

public class ScannerPractise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Team A Name");
		
		String name = sc.next();

		System.out.println("Enter Team B Name");
		
		String name2 = sc.next();
		
		System.out.println("Enter Total Overs");
		
		int i = sc.nextInt();
		
		System.out.println("Enter Team A Score with Overs");
		
		int j = sc.nextInt();
		
        System.out.println("Enter Team B Score with Overs");
		
		int k = sc.nextInt();
		
		System.out.println("Enter Winning Team");
	
		String name3 = sc.next();
		
		System.out.println("Enter weather condition is good or bad ");
		
		String name4 = sc.next();
		
		System.out.println("Enter weather if Bad reduced overs");
		
		int l = sc.nextInt();
		
		System.out.println("Enter weather if Good Continue with total overs");
		
		String name5 = sc.nextLine();
		
		System.out.println("Enter cancelled hours");  //3hrs match cancelled		
		
		int n = sc.nextInt();
		
	
		
	}

}
