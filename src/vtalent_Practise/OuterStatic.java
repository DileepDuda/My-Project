package vtalent_Practise;

public class OuterStatic {

	private int i;
	
	public void function()
	{
		System.out.println("Outer class"+i);
		
	}
	
	static class Inner
	{
		public float j;
		
		public void function()
		{
			OuterStatic ca = new OuterStatic(); // it is considering as new
			
			System.out.println("Inner class"+(j+ca.i));
		}
	}
	
		public static void main(String[] args)
		{
		  OuterStatic c = new OuterStatic(); //assigned value and excueted
		  c.i = 15;
		  c.function();
		  
		  OuterStatic.Inner b = new OuterStatic.Inner();
		  b.j = 2.56f;
		  b.function();
				 

		}

	}
