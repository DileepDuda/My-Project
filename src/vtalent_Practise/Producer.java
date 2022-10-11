package vtalent_Practise;

public class Producer {
	
	private Shop shop;
	private int numbers;
	
	public  Producer(Shop s , int numbers )
	{
		shop = s;
		this.numbers= numbers;
	
  
	for(int i = 0;i<10;i++)
	{
		shop.put();
		
		System.out.println("product values"+this.numbers+i);
	}
	try{
		sleep((int)(Math.random()*100));
	}catch(Exception ie){
		
	ie.printStackTrace();
	}
}
}
