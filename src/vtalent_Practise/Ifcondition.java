package vtalent_Practise;

public class Ifcondition 

{
	public void hero(int z)
	{
		if(z%2==0)
		{
			System.out.println("even"+z);
			
		}
		else
		{
			System.out.println("odd"+z);
		}
	}
		public static void main(String ar[])
		{
			Ifcondition obj = new Ifcondition();
			
			obj.hero(155);
			obj.hero(210);
			obj.hero(199);
		}
	}
	
