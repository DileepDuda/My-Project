package vtalent_Practise;

public class Market {

	private int material;
	private boolean availability= false;
	
	public synchronized int get()
	{
		while(availability == false)
		{
			try{
				wait();}
			catch(Exception ie){
				
			}
		}
		
		
		return material;
		
	}
	
	public synchronized void put()
	{
		while(availability == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 material = material;
			availability = true;
			notifyAll();
		}
		
	}
	
	
	
	
	
}
