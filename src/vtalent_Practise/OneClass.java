package vtalent_Practise;

public class OneClass {
	
	int a = 15;
	
	int b = 20;
	
	float c = 25.5f;
	
	void ExMethod()
	{
		System.out.println("First class or Super class values are :"+(a+b+c));
	}
	

	public static void main(String[] args) {
	
		OneClass O = new OneClass();
	//	OneClass O1 = new OneClass();
	//	OneClass O2 = new OneClass();
		
		
		O.ExMethod();
		
	//	O1.ExMethod();
		
	//	O2.ExMethod();
		
		
				

	}

}
