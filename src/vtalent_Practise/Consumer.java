package vtalent_Practise;

public class Consumer extends Thread {
	
	private Shop shop;
	private int number;
	
	
	
	public Consumer(Shop s ,int number)
	{
		shop = s;
		
		this.number = number;
		
	}

	public void run() {
	
     int i =0;
	
	for(i =0;i<10;i++)
		
	{
		i = shop.get();
		
		System.out.println("Product values :"+this.number+i);
	}
	

  }
}
