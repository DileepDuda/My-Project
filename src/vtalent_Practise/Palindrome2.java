package vtalent_Practise;

public class Palindrome2 {

	public static void main(String[] args) {
		
		String a = "Dad";
		
		String blank = "";
		
	char[] c = a.toCharArray();  // 'D','a','d'
	
		System.out.println(c.length);	
		
		for(int i = c.length-1;i>=0;i--)
		{
			blank = blank+c[i];
		}
         System.out.println(blank);
	}

}
