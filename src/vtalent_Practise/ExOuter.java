package vtalent_Practise;

public class ExOuter {
	
	private int a = 10;
	
	class inner
	{
	
		void innermethod()
		{
			System.out.println("Inner Class of Outer class is: "+a);
		}
	}
	
	void ExOutermethod(int i ,int j)
	{
		System.out.println("Outer class of inner class : "+(i+j));
	}

	public static void main(String[] args) {
		ExOuter o = new ExOuter();
		o.ExOutermethod(12,12);
		
		ExOuter.inner i = new ExOuter(). new inner();
		i.innermethod();
		

	}

}
