package vtalent_Practise;

public class Strings {

	public static void main(String[] args) 
	{
		// creating a string
		
		String s = "How are you";
				
		String s1 = s.concat("DILEEP");
		
		System.out.println("concatenated String is "+s1);
		
		String s2= s.concat("Madhu");
		
		System.out.println("concatenated String is "+s2);
		
		char s3 = s.charAt(5);
		
		System.out.println("String charAt 5th index posion is :"+s3);
		
		int s4 = s.compareTo(s1);
		
		System.out.println("Comparing two strings S1 & S4 :"+s4);
		
		String s5 = "how ARE you";
				
		int s6 = s5.compareToIgnoreCase(s);
		
		System.out.println("Ignore case sense string :"+s6);
		
		boolean s7 = s.equals(s5);
		
		System.out.println("equaling string value s&s5 string with index value is TRUE or False :"+s7);
		
		boolean s8 = s.equalsIgnoreCase(s5);
		
		System.out.println("equals Ignore case sense s & s5 is :"+s8);  //doubt
		
		boolean s9 = s.startsWith(s5);                            //doubt
		
		System.out.println("boolean- Starting with string is "+s9);
		
		boolean s10 = s.endsWith(s5);                            //doubt
				
		System.out.println("boolean- Ends with string is "+s10);	
		
		String a = "DILEEP";                   //both are same string still having boolean type is false
		
		boolean b = a.equalsIgnoreCase(s1);
		
		System.out.println("checking with a&s1:"+b);
		
		int s11 = s1.indexOf(a);         //counting start with 0
		
		System.out.println("string index is :"+s11);
		
		int s12 = s.lastIndexOf(a);                  //doubt
		
		System.out.println("last index of string is :"+s12);
		
	//	String s13 = s.replace(h, H);                //doubt
		
	//	System.out.println("replacing values are p &f instead of DILEEP"+s13);
		
	    
		
		
	}

}
