package vtalent_Practise;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountCharInString {
	
	

	public static void main(String[] args) 
	{  //Input ok
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();  //"Dil eep"
		
		//replace the white space
		s = s.replace(" ", "");
		
		//make the string in char array
		char arr[] = s.toCharArray();  //Character array
		
		//apply the logic
		int count = 0;
		
		Map<Character,Integer>map = new TreeMap<>();
		
		for (int i =0;i<arr.length;i++)
		{
			count = 0;
			for(int j = 0;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					count++;
				}
				//store the char and count
				map.put(arr[i], count);
			}
			System.out.println("Dileep each charecter length is : ");
		}
		System.out.println("Iam Learning Java");

	}

}
