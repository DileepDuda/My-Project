package com.producerconsumer.practise;

public class Store {
	
	private int items;
	
	private boolean availability;
	
	public synchronized int get() {    //get means we are checking
		while(availability == false)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
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
