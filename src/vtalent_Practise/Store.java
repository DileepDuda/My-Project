package vtalent_Practise;

public class Store {
	
	private int items;
	
	private boolean availability = false;
	
	public synchronized int get()
	{
		while(availability == false)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		return items;
		
	}
	
	public synchronized void put()
	{
		while(availability == true)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		items = items;
		availability = true;
		notifyAll();
		
	}

}
