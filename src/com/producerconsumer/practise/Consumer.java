package com.producerconsumer.practise;

public class Consumer extends Thread {
	private Store store;
	
	private int items;
	
	public Consumer(Store S ,int items)
	{
		store = S;
		this.items = items;
	}

	public void run()
	{
		int i = 0;
		
		for(i= 0;i<10;i++) 
		{
			i = store.get();
			
			System.out.println("product values :"+this.items+i);
			
		}
		
		
		
	}
}
