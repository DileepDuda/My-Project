package vtalent_Practise;

public class MemberInnerOuterClass 
{
	private int i;
	
	public void function() 
	{
		System.out.println("outer class "+i);
	}
	
 class inner 
 {
	 float f;
	 
	 public void function()
	 {
		 System.out.println("Inner class"+(f+i));
	 }
	 
 }
	public static void main(String[] args) 
	{
		MemberInnerOuterClass mr = new MemberInnerOuterClass();
		mr.i = 5;
		mr.function();
		
		MemberInnerOuterClass.inner n = mr.new inner();
		n.f = (float)1.5;
		n.function();
		
		

	}

}
