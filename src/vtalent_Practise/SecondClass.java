package vtalent_Practise;

public class SecondClass extends OneClass	
{
   int d = 10;
   int e = 20;
   double f = 100.88d;
   
   void Ex2Method()
   {
	   System.out.println("The values of OneClass&SecondClass : "+(a+b+c+d+e+f));
   }
	
	public static void main(String[] args) {
		
		SecondClass S = new SecondClass();
		
	    S.Ex2Method();

	}

}
