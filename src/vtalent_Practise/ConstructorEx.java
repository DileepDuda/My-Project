package vtalent_Practise;

public class ConstructorEx {
	
	public ConstructorEx()
	{
		System.out.println("Constructor");
		
	}
	public ConstructorEx(int i,int j)
	{
		System.out.println("Addition value is "+(i+j));
	}
	public ConstructorEx(String name)
	{
		System.out.println("Welcome to  "+name);
	}

	public static void main(String[] args) {
		
		ConstructorEx e = new ConstructorEx();
		ConstructorEx e1 = new ConstructorEx(12,12);
		ConstructorEx e2 = new ConstructorEx("JAVA");
		
	}

}
