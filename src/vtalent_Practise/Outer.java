package vtalent_Practise;

public class Outer {
	
    private int s;
    
    public void method( ) 
    {
    	System.out.println("Outer class"+s);
    	
    }
    
    class inner
    {
    	public int t;
    	
    	public void method()
    	{
    		System.out.println("Inner class"+(t+s));
    	}
    	
    }

	public static void main(String[] args) {
		
     Outer r = new Outer();
     r.s = 10;
     r.method();
     
     Outer.inner q = r.new inner();
     
     q.t = 20;
     q.method();
     
     
	}

}
