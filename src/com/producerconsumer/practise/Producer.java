package com.producerconsumer.practise;

public class Producer extends Thread {
	
	private Store store;
	
	private int items;
	
	public Producer(Store S,int items)   //for assigning the values use constructor
	{
		store = S;
		this.items = items;
		
	  } 


    
	public void run()   
	   int i = 0;
	{
		for(i=0;i<10;i++)
		{
			store.put();
			
			System.out.println("product values"+this.items+i);
		}
	
	try {
		sleep((int)Math.random()*1000);
	}catch(Exception ie){
		ie.printStackTrace();
	}
	
}
}