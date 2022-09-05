package vtalent_Practise;

public class Strings2 
{

	public static void main(String[] args )
	{
		// creating string
		
		String s = "DILEEP";
		
		String s1 = "dileep";
		
		String a = "MADHU";
		
		String b = " Welcome to java ";
	
		boolean s2 = s1.equals(s);
		
		System.out.println("comparing s1&s is :"+s2);
		
		boolean s3 = b.isEmpty();
		
		System.out.println("is empty of b is :"+s3);
		
		String s4 = s.replace('D','P');
		
		System.out.println("Replacing Char is P instead of D is :"+s4);
		
		String s0 = s.replaceAll("DI", "PHI");
		
		System.out.println("Replacing String value is DI instead of PHI is :"+s0);
				
		boolean s5 = s.equalsIgnoreCase(s1);
		
		System.out.println("Strings equaling with ignore case sense :"+s5);
		
		String[] s6 = b.split("l");
		
		for(String ab:s6)
		{
			System.out.println("Splitting string value with L "+ab);
			
		}
		
		
		String s7 = s.toLowerCase();
		
		System.out.println(" String name changing to Lowercase :"+s7);
		
		String s8 = s1.toUpperCase();
		
		System.out.println(" String name changing to Uppercase :"+s8);
		
		String s9 = b.trim();
		
		System.out.println(" Triming spaces" +s9);
		
		
		boolean s10 = s.contains(s1);
		
		System.out.println(" boolean contain is "+s10);
		
		String s11 = s.substring(3);
		
		System.out.println("substring is :"+s11);
		
		char s12 = a.charAt(2);
		
		System.out.println(" char provided index value 2 is "+s12);
		
		int s13 = a.length();
		
		System.out.println("s length of string is :"+s13);
		
		
		
		
		
		
		
		
		
		
		

	}

}
