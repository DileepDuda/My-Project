package vtalent_Practise;

public class Palindrome {

	public static void main(String[] args) {
		
		String S = "Refer";
		String Reverse = "";
		
		
		char[] c = S.toCharArray();  // 'R','e','f','e','r',
		
		System.out.println(c.length);
		
		for(int i = c.length-1;i>=0;i--)
		{
			Reverse = Reverse+c[i];
			
		}
		System.out.print(Reverse);

	}

}
